UPDATE bdconsecutivos SET numero = (SELECT (CASE WHEN (SELECT COUNT(id) FROM bdmultiempresa) > 0 THEN (SELECT COUNT(id) FROM bdmultiempresa) ELSE 1 END)) WHERE id = "MULTI";