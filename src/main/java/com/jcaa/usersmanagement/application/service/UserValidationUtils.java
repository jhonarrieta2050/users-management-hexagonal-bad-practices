package com.jcaa.usersmanagement.application.service;

/**
 * Clean Code - Regla 13 (evitar clases utilitarias innecesarias):
 * Esta clase se deja solo como marcador deprecado; la lógica vive en el dominio.
 */
@Deprecated
public final class UserValidationUtils {

  private UserValidationUtils() {
    throw new AssertionError("Use domain methods on UserModel/UserRole/UserEmail/UserPassword.");
  }
}
