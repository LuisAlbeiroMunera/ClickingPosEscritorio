ALTER TABLE configuracion ADD `logs` BOOLEAN NOT NULL DEFAULT 1;
ALTER TABLE configuracion ADD `debug` BOOLEAN NOT NULL DEFAULT 0;
ALTER TABLE configuracion ADD `validarConfSiempre` BOOLEAN NOT NULL DEFAULT 1;