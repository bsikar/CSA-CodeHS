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

public class Hello 
{
    private String name;

    public Hello (String yourName)
    {
        name = yourName;
    }

    public void english()
    {
        System.out.print("Hello ");
        System.out.print(name);
        System.out.println("!");
    }

    public void spanish()
    {
        System.out.print("Hola ");
        System.out.print(name);
        System.out.println("!");
    }

    public void french()
    {
        System.out.print("Bonjour ");
        System.out.print(name);
        System.out.println("!");
    }

    public void german()
    {
        System.out.print("Hallo ");
        System.out.print(name);
        System.out.println("!");
    }

    public void russian()
    {
        System.out.print("Privet ");
        System.out.print(name);
        System.out.println("!");
    }

    public void chinese()
    {
        System.out.print("Ni hao ");
        System.out.print(name);
        System.out.println("!");
    }
}

