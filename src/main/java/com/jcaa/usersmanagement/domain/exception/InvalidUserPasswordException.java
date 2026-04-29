package com.jcaa.usersmanagement.domain.exception;

public final class InvalidUserPasswordException extends DomainException {

  private static final String MESSAGE_EMPTY_PASSWORD =
      "The user password must not be empty.";
  private static final String MESSAGE_PASSWORD_TOO_SHORT =
      "The user password must have at least %d characters.";

  private InvalidUserPasswordException(final String message) {
    super(message);
  }

  public static InvalidUserPasswordException becauseValueIsEmpty() {
    return new InvalidUserPasswordException(MESSAGE_EMPTY_PASSWORD);
  }

  public static InvalidUserPasswordException becauseLengthIsTooShort(final int minimumLength) {
    return new InvalidUserPasswordException(
        String.format(MESSAGE_PASSWORD_TOO_SHORT, minimumLength));
  }
}
