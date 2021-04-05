/* MIT License
 *
 * Copyright (c) 2021 Brighton Sikarskie
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

public class Student {
    private static final int NUM_EXAMS = 4;

    private String firstName;
    private String lastName;
    private int gradeLevel;
    private double gpa;

    private int[] exams;
    private int numExamsTaken;

    /**
     * This is a constructor.  A constructor is a method
     * that creates an object -- it creates an instance
     * of the class. What that means is it takes the input
     * parameters and sets the instance variables (or fields)
     * to the proper values.
     *
     * Check out StudentTester.java for an example of how to use
     * this constructor.
     */
    public Student(String fName, String lName, int grade) {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
        exams = new int[NUM_EXAMS];
        numExamsTaken = 0;
    }

    public int getExamRange() {
        if (numExamsTaken == 0) {
            return 0;
        }
        int lower = exams[0];
        int upper = exams[0];
        for (int i : exams) {
            if (i < lower) {
                lower = i;
            }
            if (i > upper) {
                upper = i;
            }
        }

        return upper - lower;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public void addExamScore(int score) {
        exams[numExamsTaken] = score;
        numExamsTaken++;
    }

    public void setGPA(double theGPA) {
        gpa = theGPA;
    }

    /**
     * This is a toString for the Student class. It returns a String
     * representation of the object, which includes the fields
     * in that object.
     */
    public String toString() {
        return firstName + " " + lastName + " is in grade: " + gradeLevel;
    }
}