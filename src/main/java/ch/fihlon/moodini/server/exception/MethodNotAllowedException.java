/*
 * Moodini
 * Copyright (C) 2016 Marcus Fihlon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package ch.fihlon.moodini.server.exception;

import javax.validation.constraints.NotNull;

/**
 * This implementation of an exception is mapped to a HTTP status code of "405 METHOD NOT ALLOWED".
 */
public class MethodNotAllowedException extends StatusCodeException {

    private static final int SC_METHOD_NOT_ALLOWED = 405;

    /**
     * This constructor creates a {@link MethodNotAllowedException} without a message.
     */
    public MethodNotAllowedException() {
        super(SC_METHOD_NOT_ALLOWED);
    }

    /**
     * This constructor creates a {@link MethodNotAllowedException} with a message.
     *
     * @param message the message
     */
    public MethodNotAllowedException(@NotNull final String message) {
        super(SC_METHOD_NOT_ALLOWED, message);
    }
}