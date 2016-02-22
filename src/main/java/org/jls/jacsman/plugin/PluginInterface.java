/*#
 * The MIT License (MIT)
 * 
 * Copyright (c) 2016 LE SAUCE Julien
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 #*/

package org.jls.jacsman.plugin;

import java.io.IOException;

import org.jls.toolbox.net.Interface;

/**
 * Represents a network interface used between the plugin and JaCSMan
 * application.
 * 
 * @author Julien LE SAUCE
 * @date 22 févr. 2016
 */
public interface PluginInterface {

	/**
	 * Sends the specified message to the client/server.
	 * 
	 * @param msg
	 *            The message to send.
	 * @return Number of bytes sent if successful or a value &lt; 0 if an error
	 *         occurred.
	 * @throws IOException
	 *             If an error occurred sending the message.
	 */
	public int send (final byte[] msg) throws IOException;

	/**
	 * Tells if the client/server is running or not.
	 * 
	 * @return <code>true</code> if the client/server is running,
	 *         <code>false</code> otherwise.
	 */
	public boolean isRunning ();

	/**
	 * Returns the {@link Interface} associated with this client/server.
	 * 
	 * @return {@link Interface} associated with this client/server.
	 */
	public Interface getInterface ();
}