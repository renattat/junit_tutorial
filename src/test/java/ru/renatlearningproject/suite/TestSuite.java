package ru.renatlearningproject.suite;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
//@SelectClasses(ClassATest.class)
//@SelectClasses({ClassATest.class, ClassBTest.class, ClassCTest.class})
//@SelectPackages("ru.renatlearningproject.annotations")
@SelectPackages({"ru.renatlearningproject.annotations", "ru.renatlearningproject.suite"})
public class TestSuite {
}
