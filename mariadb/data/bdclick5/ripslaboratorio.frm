TYPE=VIEW
query=(select `bdclick5`.`ripslaboratorio1`.`orden` AS `orden`,`bdclick5`.`ripslaboratorio1`.`codigoIps` AS `codigoIps`,`bdclick5`.`ripslaboratorio1`.`autorizacion` AS `autorizacion`,`bdclick5`.`ripslaboratorio1`.`Id` AS `Id`,`bdclick5`.`ripslaboratorio1`.`fecha` AS `fecha`,`bdclick5`.`ripslaboratorio1`.`actoQuirurgico` AS `actoQuirurgico`,`bdclick5`.`ripslaboratorio1`.`cup` AS `cup`,`bdclick5`.`ripslaboratorio1`.`cantidad` AS `cantidad`,`bdclick5`.`ripslaboratorio1`.`cantidadRealizada` AS `cantidadRealizada`,`bdclick5`.`ripslaboratorio1`.`copago` AS `copago`,`bdclick5`.`ripslaboratorio1`.`cie` AS `cie`,`bdclick5`.`ripslaboratorio1`.`telefono` AS `telefono`,`bdclick5`.`ripslaboratorio1`.`celular` AS `celular`,`bdclick5`.`ripslaboratorio1`.`nacimiento` AS `nacimiento`,`bdclick5`.`ripslaboratorio1`.`valor` AS `valor`,`bdclick5`.`ripslaboratorio1`.`nombre` AS `nombre`,`bdclick5`.`ripslaboratorio1`.`codigoTarifa` AS `codigoTarifa`,`bdclick5`.`ripslaboratorio1`.`procedimientoAutorizado` AS `procedimientoAutorizado`,`bdclick5`.`ripslaboratorio1`.`eps` AS `eps`,`bdclick5`.`ripslaboratorio1`.`ciudad` AS `ciudad`,`bdclick5`.`ripslaboratorio1`.`departamento` AS `departamento`,`bdclick5`.`ripslaboratorio1`.`pNombre` AS `pNombre`,`bdclick5`.`ripslaboratorio1`.`sNombre` AS `sNombre`,`bdclick5`.`ripslaboratorio1`.`pApellido` AS `pApellido`,`bdclick5`.`ripslaboratorio1`.`sApellido` AS `sApellido`,`bdclick5`.`ripslaboratorio1`.`tipoIdentidad` AS `tipoIdentidad`,`bdclick5`.`ripslaboratorio1`.`tipoIdentidadDesc` AS `tipoIdentidadDesc`,`bdclick5`.`ripslaboratorio1`.`codigoEntidadAdministradora` AS `codigoEntidadAdministradora`,`bdclick5`.`ripslaboratorio1`.`TipoUsuario` AS `TipoUsuario`,`bdclick5`.`ripslaboratorio1`.`tipoUsuarioDesc` AS `tipoUsuarioDesc`,`bdclick5`.`ripslaboratorio1`.`Edad` AS `Edad`,`bdclick5`.`ripslaboratorio1`.`unidadMedidaEdad` AS `unidadMedidaEdad`,`bdclick5`.`ripslaboratorio1`.`sexo` AS `sexo`,`bdclick5`.`ripslaboratorio1`.`zona` AS `zona`,`bdclick5`.`ripslaboratorio1`.`zonaDesc` AS `zonaDesc`,`bdclick5`.`ripslaboratorio1`.`codPrestadorServicio` AS `codPrestadorServicio`,`bdclick5`.`ripslaboratorio1`.`razonSocial` AS `razonSocial`,`bdclick5`.`ripslaboratorio1`.`tipoPrestadorServicio` AS `tipoPrestadorServicio`,`bdclick5`.`ripslaboratorio1`.`IdPrestadorServicio` AS `IdPrestadorServicio`,`bdclick5`.`ripslaboratorio1`.`nombreEntidadAdministradora` AS `nombreEntidadAdministradora`,`bdclick5`.`ripslaboratorio1`.`nroPoliza` AS `nroPoliza`,`bdclick5`.`ripslaboratorio1`.`valorComision` AS `valorComision`,`bdclick5`.`ripslaboratorio1`.`valorDescuento` AS `valorDescuento`,`bdclick5`.`ripslaboratorio1`.`numeroContrato` AS `numeroContrato`,`bdclick5`.`ripslaboratorio1`.`tipoOrden` AS `tipoOrden`,`bdclick5`.`ripslaboratorio1`.`codigoConcepto` AS `codigoConcepto`,`bdclick5`.`ripslaboratorio1`.`conceptoDesc` AS `conceptoDesc`,`bdclick5`.`ripslaboratorio1`.`codConsulta` AS `codConsulta`,`bdclick5`.`ripslaboratorio1`.`codigoConsultaDesc` AS `codigoConsultaDesc`,`bdclick5`.`ripslaboratorio1`.`finalidadd` AS `finalidadd`,`bdclick5`.`ripslaboratorio1`.`finalidadDesc` AS `finalidadDesc`,`bdclick5`.`ripslaboratorio1`.`causaExterna` AS `causaExterna`,`bdclick5`.`ripslaboratorio1`.`causaExternaDesc` AS `causaExternaDesc`,\'1\' AS `tipoDiagnosticoPrincipal`,if((`bdclick5`.`ripslaboratorio1`.`tipoOrden` = \'procedimiento\'),\'\',`bdclick5`.`bdconsultalaboratorio`.`cie2`) AS `codDiagnosticoReacionado1`,if((`bdclick5`.`ripslaboratorio1`.`tipoOrden` = \'procedimiento\'),\'\',`bdclick5`.`bdconsultalaboratorio`.`cie3`) AS `codDiagnosticoReacionado2`,if((`bdclick5`.`ripslaboratorio1`.`tipoOrden` = \'procedimiento\'),\'\',`bdclick5`.`bdconsultalaboratorio`.`cie4`) AS `codDiagnosticoReacionado3`,`bdclick5`.`ripslaboratorio1`.`valorCuotaModeradora` AS `valorCuotaModeradora`,`bdclick5`.`ripslaboratorio1`.`ambitoProcedimiento` AS `ambitoProcedimiento`,`bdclick5`.`ripslaboratorio1`.`ambitoProcedimientoDesc` AS `ambitoProcedimientoDesc`,`bdclick5`.`ripslaboratorio1`.`personalAtiende` AS `personalAtiende`,`bdclick5`.`ripslaboratorio1`.`personalDesc` AS `personalDesc`,if((`bdclick5`.`ripslaboratorio1`.`tipoOrden` = \'procedimiento\'),`bdclick5`.`bdconsultalaboratorio`.`cie2`,\'\') AS `DiagnosticoRelacionado`,if((`bdclick5`.`ripslaboratorio1`.`tipoOrden` = \'procedimiento\'),`bdclick5`.`bdconsultalaboratorio`.`cie4`,\'\') AS `complicaciones`,`bdclick5`.`ripslaboratorio1`.`Estado` AS `Estado`,`bdclick5`.`ripslaboratorio1`.`codigoDepartamento` AS `codigoDepartamento`,`bdclick5`.`ripslaboratorio1`.`codigoMunicipio` AS `codigoMunicipio`,`bdclick5`.`ripslaboratorio1`.`estado2` AS `estado2`,`bdclick5`.`ripslaboratorio1`.`facturaNumero` AS `facturaNumero` from (`bdclick5`.`ripslaboratorio1` left join `bdclick5`.`bdconsultalaboratorio` on((`bdclick5`.`ripslaboratorio1`.`orden` = `bdclick5`.`bdconsultalaboratorio`.`orden`))))
md5=5b3bf4f9a98e1f345bcac93c36011586
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:50
create-version=2
source=(select `ripslaboratorio1`.`orden` AS `orden`,`ripslaboratorio1`.`codigoIps` AS `codigoIps`,`ripslaboratorio1`.`autorizacion` AS `autorizacion`,`ripslaboratorio1`.`Id` AS `Id`,`ripslaboratorio1`.`fecha` AS `fecha`,`ripslaboratorio1`.`actoQuirurgico` AS `actoQuirurgico`,`ripslaboratorio1`.`cup` AS `cup`,`ripslaboratorio1`.`cantidad` AS `cantidad`,`ripslaboratorio1`.`cantidadRealizada` AS `cantidadRealizada`,`ripslaboratorio1`.`copago` AS `copago`,`ripslaboratorio1`.`cie` AS `cie`,`ripslaboratorio1`.`telefono` AS `telefono`,`ripslaboratorio1`.`celular` AS `celular`,`ripslaboratorio1`.`nacimiento` AS `nacimiento`,`ripslaboratorio1`.`valor` AS `valor`,`ripslaboratorio1`.`nombre` AS `nombre`,`ripslaboratorio1`.`codigoTarifa` AS `codigoTarifa`,`ripslaboratorio1`.`procedimientoAutorizado` AS `procedimientoAutorizado`,`ripslaboratorio1`.`eps` AS `eps`,`ripslaboratorio1`.`ciudad` AS `ciudad`,`ripslaboratorio1`.`departamento` AS `departamento`,`ripslaboratorio1`.`pNombre` AS `pNombre`,`ripslaboratorio1`.`sNombre` AS `sNombre`,`ripslaboratorio1`.`pApellido` AS `pApellido`,`ripslaboratorio1`.`sApellido` AS `sApellido`,`ripslaboratorio1`.`tipoIdentidad` AS `tipoIdentidad`,`ripslaboratorio1`.`tipoIdentidadDesc` AS `tipoIdentidadDesc`,`ripslaboratorio1`.`codigoEntidadAdministradora` AS `codigoEntidadAdministradora`,`ripslaboratorio1`.`TipoUsuario` AS `TipoUsuario`,`ripslaboratorio1`.`tipoUsuarioDesc` AS `tipoUsuarioDesc`,`ripslaboratorio1`.`Edad` AS `Edad`,`ripslaboratorio1`.`unidadMedidaEdad` AS `unidadMedidaEdad`,`ripslaboratorio1`.`sexo` AS `sexo`,`ripslaboratorio1`.`zona` AS `zona`,`ripslaboratorio1`.`zonaDesc` AS `zonaDesc`,`ripslaboratorio1`.`codPrestadorServicio` AS `codPrestadorServicio`,`ripslaboratorio1`.`razonSocial` AS `razonSocial`,`ripslaboratorio1`.`tipoPrestadorServicio` AS `tipoPrestadorServicio`,`ripslaboratorio1`.`IdPrestadorServicio` AS `IdPrestadorServicio`,`ripslaboratorio1`.`nombreEntidadAdministradora` AS `nombreEntidadAdministradora`,`ripslaboratorio1`.`nroPoliza` AS `nroPoliza`,`ripslaboratorio1`.`valorComision` AS `valorComision`,`ripslaboratorio1`.`valorDescuento` AS `valorDescuento`,`ripslaboratorio1`.`numeroContrato` AS `numeroContrato`,`ripslaboratorio1`.`tipoOrden` AS `tipoOrden`,`ripslaboratorio1`.`codigoConcepto` AS `codigoConcepto`,`ripslaboratorio1`.`conceptoDesc` AS `conceptoDesc`,`ripslaboratorio1`.`codConsulta` AS `codConsulta`,`ripslaboratorio1`.`codigoConsultaDesc` AS `codigoConsultaDesc`,`ripslaboratorio1`.`finalidadd` AS `finalidadd`,`ripslaboratorio1`.`finalidadDesc` AS `finalidadDesc`,`ripslaboratorio1`.`causaExterna` AS `causaExterna`,`ripslaboratorio1`.`causaExternaDesc` AS `causaExternaDesc`,\'1\' AS `tipoDiagnosticoPrincipal`,if((`ripslaboratorio1`.`tipoOrden` = \'procedimiento\'),\'\',`bdconsultalaboratorio`.`cie2`) AS `codDiagnosticoReacionado1`,if((`ripslaboratorio1`.`tipoOrden` = \'procedimiento\'),\'\',`bdconsultalaboratorio`.`cie3`) AS `codDiagnosticoReacionado2`,if((`ripslaboratorio1`.`tipoOrden` = \'procedimiento\'),\'\',`bdconsultalaboratorio`.`cie4`) AS `codDiagnosticoReacionado3`,`ripslaboratorio1`.`valorCuotaModeradora` AS `valorCuotaModeradora`,`ripslaboratorio1`.`ambitoProcedimiento` AS `ambitoProcedimiento`,`ripslaboratorio1`.`ambitoProcedimientoDesc` AS `ambitoProcedimientoDesc`,`ripslaboratorio1`.`personalAtiende` AS `personalAtiende`,`ripslaboratorio1`.`personalDesc` AS `personalDesc`,if((`ripslaboratorio1`.`tipoOrden` = \'procedimiento\'),`bdconsultalaboratorio`.`cie2`,\'\') AS `DiagnosticoRelacionado`,if((`ripslaboratorio1`.`tipoOrden` = \'procedimiento\'),`bdconsultalaboratorio`.`cie4`,\'\') AS `complicaciones`,`ripslaboratorio1`.`Estado` AS `Estado`,`ripslaboratorio1`.`codigoDepartamento` AS `codigoDepartamento`,`ripslaboratorio1`.`codigoMunicipio` AS `codigoMunicipio`,`ripslaboratorio1`.`estado2` AS `estado2`,`ripslaboratorio1`.`facturaNumero` AS `facturaNumero` from (`ripslaboratorio1` left join `bdconsultalaboratorio` on((`ripslaboratorio1`.`orden` = `bdconsultalaboratorio`.`orden`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick5`.`ripslaboratorio1`.`orden` AS `orden`,`bdclick5`.`ripslaboratorio1`.`codigoIps` AS `codigoIps`,`bdclick5`.`ripslaboratorio1`.`autorizacion` AS `autorizacion`,`bdclick5`.`ripslaboratorio1`.`Id` AS `Id`,`bdclick5`.`ripslaboratorio1`.`fecha` AS `fecha`,`bdclick5`.`ripslaboratorio1`.`actoQuirurgico` AS `actoQuirurgico`,`bdclick5`.`ripslaboratorio1`.`cup` AS `cup`,`bdclick5`.`ripslaboratorio1`.`cantidad` AS `cantidad`,`bdclick5`.`ripslaboratorio1`.`cantidadRealizada` AS `cantidadRealizada`,`bdclick5`.`ripslaboratorio1`.`copago` AS `copago`,`bdclick5`.`ripslaboratorio1`.`cie` AS `cie`,`bdclick5`.`ripslaboratorio1`.`telefono` AS `telefono`,`bdclick5`.`ripslaboratorio1`.`celular` AS `celular`,`bdclick5`.`ripslaboratorio1`.`nacimiento` AS `nacimiento`,`bdclick5`.`ripslaboratorio1`.`valor` AS `valor`,`bdclick5`.`ripslaboratorio1`.`nombre` AS `nombre`,`bdclick5`.`ripslaboratorio1`.`codigoTarifa` AS `codigoTarifa`,`bdclick5`.`ripslaboratorio1`.`procedimientoAutorizado` AS `procedimientoAutorizado`,`bdclick5`.`ripslaboratorio1`.`eps` AS `eps`,`bdclick5`.`ripslaboratorio1`.`ciudad` AS `ciudad`,`bdclick5`.`ripslaboratorio1`.`departamento` AS `departamento`,`bdclick5`.`ripslaboratorio1`.`pNombre` AS `pNombre`,`bdclick5`.`ripslaboratorio1`.`sNombre` AS `sNombre`,`bdclick5`.`ripslaboratorio1`.`pApellido` AS `pApellido`,`bdclick5`.`ripslaboratorio1`.`sApellido` AS `sApellido`,`bdclick5`.`ripslaboratorio1`.`tipoIdentidad` AS `tipoIdentidad`,`bdclick5`.`ripslaboratorio1`.`tipoIdentidadDesc` AS `tipoIdentidadDesc`,`bdclick5`.`ripslaboratorio1`.`codigoEntidadAdministradora` AS `codigoEntidadAdministradora`,`bdclick5`.`ripslaboratorio1`.`TipoUsuario` AS `TipoUsuario`,`bdclick5`.`ripslaboratorio1`.`tipoUsuarioDesc` AS `tipoUsuarioDesc`,`bdclick5`.`ripslaboratorio1`.`Edad` AS `Edad`,`bdclick5`.`ripslaboratorio1`.`unidadMedidaEdad` AS `unidadMedidaEdad`,`bdclick5`.`ripslaboratorio1`.`sexo` AS `sexo`,`bdclick5`.`ripslaboratorio1`.`zona` AS `zona`,`bdclick5`.`ripslaboratorio1`.`zonaDesc` AS `zonaDesc`,`bdclick5`.`ripslaboratorio1`.`codPrestadorServicio` AS `codPrestadorServicio`,`bdclick5`.`ripslaboratorio1`.`razonSocial` AS `razonSocial`,`bdclick5`.`ripslaboratorio1`.`tipoPrestadorServicio` AS `tipoPrestadorServicio`,`bdclick5`.`ripslaboratorio1`.`IdPrestadorServicio` AS `IdPrestadorServicio`,`bdclick5`.`ripslaboratorio1`.`nombreEntidadAdministradora` AS `nombreEntidadAdministradora`,`bdclick5`.`ripslaboratorio1`.`nroPoliza` AS `nroPoliza`,`bdclick5`.`ripslaboratorio1`.`valorComision` AS `valorComision`,`bdclick5`.`ripslaboratorio1`.`valorDescuento` AS `valorDescuento`,`bdclick5`.`ripslaboratorio1`.`numeroContrato` AS `numeroContrato`,`bdclick5`.`ripslaboratorio1`.`tipoOrden` AS `tipoOrden`,`bdclick5`.`ripslaboratorio1`.`codigoConcepto` AS `codigoConcepto`,`bdclick5`.`ripslaboratorio1`.`conceptoDesc` AS `conceptoDesc`,`bdclick5`.`ripslaboratorio1`.`codConsulta` AS `codConsulta`,`bdclick5`.`ripslaboratorio1`.`codigoConsultaDesc` AS `codigoConsultaDesc`,`bdclick5`.`ripslaboratorio1`.`finalidadd` AS `finalidadd`,`bdclick5`.`ripslaboratorio1`.`finalidadDesc` AS `finalidadDesc`,`bdclick5`.`ripslaboratorio1`.`causaExterna` AS `causaExterna`,`bdclick5`.`ripslaboratorio1`.`causaExternaDesc` AS `causaExternaDesc`,\'1\' AS `tipoDiagnosticoPrincipal`,if((`bdclick5`.`ripslaboratorio1`.`tipoOrden` = \'procedimiento\'),\'\',`bdclick5`.`bdconsultalaboratorio`.`cie2`) AS `codDiagnosticoReacionado1`,if((`bdclick5`.`ripslaboratorio1`.`tipoOrden` = \'procedimiento\'),\'\',`bdclick5`.`bdconsultalaboratorio`.`cie3`) AS `codDiagnosticoReacionado2`,if((`bdclick5`.`ripslaboratorio1`.`tipoOrden` = \'procedimiento\'),\'\',`bdclick5`.`bdconsultalaboratorio`.`cie4`) AS `codDiagnosticoReacionado3`,`bdclick5`.`ripslaboratorio1`.`valorCuotaModeradora` AS `valorCuotaModeradora`,`bdclick5`.`ripslaboratorio1`.`ambitoProcedimiento` AS `ambitoProcedimiento`,`bdclick5`.`ripslaboratorio1`.`ambitoProcedimientoDesc` AS `ambitoProcedimientoDesc`,`bdclick5`.`ripslaboratorio1`.`personalAtiende` AS `personalAtiende`,`bdclick5`.`ripslaboratorio1`.`personalDesc` AS `personalDesc`,if((`bdclick5`.`ripslaboratorio1`.`tipoOrden` = \'procedimiento\'),`bdclick5`.`bdconsultalaboratorio`.`cie2`,\'\') AS `DiagnosticoRelacionado`,if((`bdclick5`.`ripslaboratorio1`.`tipoOrden` = \'procedimiento\'),`bdclick5`.`bdconsultalaboratorio`.`cie4`,\'\') AS `complicaciones`,`bdclick5`.`ripslaboratorio1`.`Estado` AS `Estado`,`bdclick5`.`ripslaboratorio1`.`codigoDepartamento` AS `codigoDepartamento`,`bdclick5`.`ripslaboratorio1`.`codigoMunicipio` AS `codigoMunicipio`,`bdclick5`.`ripslaboratorio1`.`estado2` AS `estado2`,`bdclick5`.`ripslaboratorio1`.`facturaNumero` AS `facturaNumero` from (`bdclick5`.`ripslaboratorio1` left join `bdclick5`.`bdconsultalaboratorio` on((`bdclick5`.`ripslaboratorio1`.`orden` = `bdclick5`.`bdconsultalaboratorio`.`orden`))))
mariadb-version=100135