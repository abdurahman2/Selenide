package ua.net.itlabs;

//import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.Test;

import static com.codeborne.selenide.CollectionCondition.empty;
import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by pc on 19.11.2016.
 */

public class TodoMVCTest {

    @Test
    public void testCreateTask() {
          Configuration.browser = "chrome";
//        Configuration.timeout = 2000;

// URL взят из видео - само видео https://drive.google.com/file/d/0B8hgIBw8-V-AXzJpV1k3Q25HSnc это расширенная версия этого https://www.youtube.com/watch?v=5c3z_iddWX0
// стандартный код + ожидаем - код на этом URL не хочет отрабатывать (часто не нажимается энтер) "Задача 1"
/*
        open("http://todomvc.com/examples/troopjs_require/#/all");
        $(".new-todo").setValue("do something").waitUntil(visible,5000).pressEnter();
        $(".new-todo").setValue("do something else").waitUntil(visible,5000).pressEnter();
        $$(".todo-list li").shouldHave(exactTexts("do something", "do something else"));
        $(".toggle-all").click();
        $(".clear-completed").click();
        $$(".todo-list li").shouldBe(empty);
*/

// стандартный код + ожидаем - URL другой, но код из "Задача 1" работает хорошо, только изменены локаторы - "Задача 2"
// URL взял тут https://docs.google.com/document/d/1yvUML7eXyEyDh5asUIL7M88RStlE1RZmgUOJZSXjMVo

        open("https://todomvc4tasj.herokuapp.com/");
        $("#new-todo").setValue("do something").waitUntil(visible,5000).pressEnter();
        $("#new-todo").setValue("do something else").waitUntil(visible,5000).pressEnter();
        $$(".view>label").shouldHave(exactTexts("do something", "do something else"));
        $("#toggle-all").click();
        $("#clear-completed").click();
        $$(".view>label").shouldBe(empty);


// URL из Google док и задание от туда https://docs.google.com/document/d/1yvUML7eXyEyDh5asUIL7M88RStlE1RZmgUOJZSXjMVo
// работает до момента click - немогу подобрать локатор - "Задача 3"
/*
        open("https://todomvc4tasj.herokuapp.com/");
        $("#new-todo").setValue("task1").pressEnter();
        $("#new-todo").setValue("task2").pressEnter();
        $("#new-todo").setValue("task3").pressEnter();
        $("#new-todo").setValue("task4").pressEnter();
        $$(".view>label").shouldHave(exactTexts("task1", "task2", "task3", "task4"));
// !!! немогу подобрать локатор, чтоб удалить "task2" 5 задание - "5 delete task2"
//        $("").click();
*/


/* добавлено ожидание и запрос в 2 строки
        $(".new-todo").setValue("do something").waitUntil(visible,5000);
        $(".new-todo").pressEnter();
        $(".new-todo").setValue("do something else").waitUntil(visible,5000);
        $(".new-todo").pressEnter();
*/

/* проверяем на 2 записи
        $$(".todo-list li").shouldHave(size(2));
*/

/* вариант 2 со slack
        $(".new-todo").setValue("do something").pressEnter();
        $(".todo-list li").shouldHave(Condition.exactText("do something"));
        $(".new-todo").setValue("do something else").pressEnter();
        $$(".todo-list li").shouldHave(CollectionCondition.exactTexts("do something", "do something else"));
*/
/*
        $$(".todo-list li").shouldHave(exactTexts("do something", "do something else"));
*/

    }

}