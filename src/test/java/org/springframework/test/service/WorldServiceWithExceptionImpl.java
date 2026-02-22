package org.springframework.test.service;

/**
 * @Date 2024/6/1 17:08
 * @Created by weixiao
 */
public class WorldServiceWithExceptionImpl implements WorldService {
    private String name;
    @Override
    public void explode() {
        System.out.println("The Earth is going to explode with an Exception");
        throw new RuntimeException();
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
