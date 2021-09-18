package org.moita.efj;

import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Application
{
    public static void main(String[] args) {
        new Application().hello();
    }

    public void hello()
    {
        String name = "{ \"name\":\"Raphael\"}";
        Gson gson = new Gson();
        Hello hello = gson.fromJson(name, Hello.class);
        System.out.println(hello.sayHello());
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static class Hello {
        private String name;

        public String sayHello() {
            return "Hello, " + name;
        }
    }
}