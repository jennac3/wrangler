/*
 * Copyright © 2017-2019 Cask Data, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package io.cdap.wrangler.api.parser;

import io.cdap.wrangler.api.annotations.PublicEvolving;

/**
 * The class <code>SyntaxError</code> contains information about the errors observed
 * during parsing of the recipe.
 *
 * <p>It contains the line number, character position, the error message and the
 * source line that has errors.</p>
 */
@PublicEvolving
public final class SyntaxError {
  private final int lineNo;
  private final int charPos;
  private final String message;
  private final String line;

  public SyntaxError(int lineNo, int charPos, String message, String line) {
    this.lineNo = lineNo;
    this.charPos = charPos;
    this.message = message;
    this.line = line;
  }

  /**
   * @return Returns the line number where the syntax error occured.
   */
  public int getLineNumber() {
    return lineNo;
  }

  /**
   * @return Returns the character position within the line where the error is suspected.
   */
  public int getCharPosition() {
    return charPos;
  }

  /**
   * @return The error message generated by the parser for the line.
   */
  public String getMessage() {
    return message;
  }

  /**
   * @return Original line that has the syntax error.
   */
  public String getLine() {
    return line;
  }

  /**
   * @return Represents the string representation of this object <code>SyntaxError</code>
   */
  @Override
  public String toString() {
    return message;
  }
}