@tag=@Tag annotation is used to categorize tests, allowing you to filter
 and run specific groups of tests based on their tags. Tags are useful
 for organizing and running tests selectively, especially when dealing with a large test suite.
  You can assign one or more tags to a test or a test class.

  import org.junit.jupiter.api.Tag;
  import org.junit.jupiter.api.Test;

  @Tag("fast")
  class FastTests {

      @Test
      @Tag("unit")
      void testMethod1() {
          // Test logic for method 1
      }

      @Test
      @Tag("integration")
      void testMethod2() {
          // Test logic for method 2
      }
  }
----------------------------------------------------------------------------

@Nested--annotation allows you to create nested test classes, providing a way to
logically group and structure your tests. Nested classes are useful when you want
to organize tests in a hierarchical manner, especially for testing different
aspects of a class or module.

@Nested
    @DisplayName("Addition Tests")
    class AdditionTests {

        @Test
        @DisplayName("Adding two positive numbers")
        void addTwoPositiveNumbers() {
            int result = calculator.add(3, 5);
            assertEquals(8, result);
        }

-----------------------------------------------------------------------------
@Testfactory--is an annotation in JUnit 5 that is used to signal that the
annotated method is a test factory method. A test factory method is responsible for
dynamically creating and providing a collection of test cases to the test runner.
This is particularly useful when you want to generate tests at runtime or based on
 some dynamic criteria.

 import org.junit.jupiter.api.DisplayName;
 import org.junit.jupiter.api.TestFactory;

 import java.util.Arrays;
 import java.util.Collection;

 import static org.junit.jupiter.api.Assertions.assertTrue;

 public class DynamicTestsExample {

     // @TestFactory annotation is used to indicate that this method is a test factory.
     @TestFactory
     @DisplayName("Dynamic Test Factory")
     Collection<DynamicTest> dynamicTests() {
         return Arrays.asList(
                 // DynamicTest takes a display name and an Executable
                 //(a functional interface representing a test case).
         dynamicTest("Test 1", () -> assertTrue(true)),
         dynamicTest("Test 2", () -> assertTrue(2 + 2 == 4)),
         dynamicTest("Test 3", () -> assertTrue(5 > 2))
         );
     }

     // Helper method to create DynamicTest instances with a given display name and Executable.
     private DynamicTest dynamicTest(String displayName, Executable executable) {
         return DynamicTest.dynamicTest(displayName, executable);
     }
 }
===============================================================================