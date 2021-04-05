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

public class StringTrace {
    public static void main(String[] args) {
        String str1 = null;
        String str2 = new String("Karel");
        String str3 = "Karel";

        if (str1 == null) {
            str1 = str2;
        }

        if (str1 == str2) {
            System.out.println("str1 and str2 refer to the same object");
        }

        //if (str2 == str3) {
        //    System.out.println("str2 and str3 refer to the same object");
        //}

        if (str1.equals(str2) && str2.equals(str3)) {
            System.out.println("str1, str2, and str3 are equal");
        }

        //if ((str1 == str2) && (str2 == str3)) {
        //    System.out.println("str1, str2, and str3 are the same objects");
        //}
    }
}
