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

import org.jls.toolbox.net.Interface;

/**
 * Object returned when an event occurres on the network interface.
 * 
 * @author Julien LE SAUCE
 * @date 22 févr. 2016
 */
public class PluginEvent {

	private final Object source; // Event's source
	private final Interface com; // Network interface descriptor
	private final byte[] message; // Received/Sent message

	/**
	 * Instanciates a new event and specifies its source.
	 * 
	 * @param src
	 *            Source of the event.
	 */
	public PluginEvent (final Object src) {
		this(src, null, null);
	}

	/**
	 * Instanciates a new event and specifies its source and its network
	 * interface descriptor.
	 * 
	 * @param src
	 *            Source of the event.
	 * @param com
	 *            Network interface descriptor.
	 */
	public PluginEvent (final Object src, final Interface com) {
		this(src, com, null);
	}

	/**
	 * Instanciates a new event and specifies its source, its network interface
	 * descriptor and, if there is one, the received/sent message.
	 * 
	 * @param src
	 *            Source of the event.
	 * @param com
	 *            Network interface descriptor.
	 * @param msg
	 *            Message associated with the event.
	 */
	public PluginEvent (final Object src, final Interface com, final byte[] msg) {
		this.source = src;
		this.com = com;
		this.message = msg;
	}

	/**
	 * Returns the source of the event.
	 * 
	 * @return Source of the event.
	 */
	public Object getSource () {
		return this.source;
	}

	/**
	 * Returns the network interface descriptor.
	 * 
	 * @return Network interface descriptor.
	 */
	public Interface getInterface () {
		return this.com;
	}

	/**
	 * Returns the received/sent message associated with this event.
	 * 
	 * @return The message associated with this event.
	 */
	public byte[] getMessage () {
		return message;
	}
}