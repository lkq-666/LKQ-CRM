package com.lkq.lkqcrm.utils;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class ShiroUtilsTest {

    @org.junit.jupiter.api.Test
    void randomSalt() {
        System.out.println("随机盐"+ShiroUtils.randomSalt());
    }

    @Test
    void encryptPassword() {
        System.out.println("密码"+ShiroUtils.encryptPassword("5201314","admin0d4320c8fa8a"));
    }
}