/**
 * Copyright 2015-2022 Kaitai Project: MIT license
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package io.kaitai.struct;

/**
 * Custom decoder interface allows implementation of "byte array in - byte array
 * out" decoders, compatible with Kaitai Struct. Classes implementing this
 * interface can be called rom inside a .ksy file using `process: XXX` syntax.
 * @see <a href="https://doc.kaitai.io/user_guide.html#custom-process">Kaitai
 *     Struct documentation on custom processing routines</a>
 */
public interface CustomDecoder {
    /**
     * Decodes a given byte array, according to some custom algorithm
     * (specific to implementing class) and parameters given in the
     * constructor, returning another byte array.
     * @param src source byte array
     * @return decoded byte array
     */
    byte[] decode(byte[] src);
}
