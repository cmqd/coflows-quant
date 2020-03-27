/*
 * The MIT License (MIT)
 * Copyright (c) Arturo Rodriguez All rights reserved.
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package app.quant.clr.function;

import scala.*;

import app.quant.clr.CLRObject;

public class CLRFunction2 extends CLRObject implements Function2<Object, Object, Object>
{
    public CLRFunction2(String classname, int ptr)
    {
        super(classname, ptr);
    }

    public Object apply(Object arg1, Object arg2)
    {
        return (Object)this.Invoke("Invoke", arg1, arg2);
    }

    @Override
    public String toString() 
    {
        return "CLRFunction2 SCALA: " + ClassName;// + " ( Ptr = " + Pointer + " | jhash = " + this.hashCode() + ")";
    }
}