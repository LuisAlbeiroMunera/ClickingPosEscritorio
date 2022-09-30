TYPE=VIEW
query=(select `bdclick`.`ripslaboratorio1`.`orden` AS `orden`,`bdclick`.`ripslaboratorio1`.`codigoIps` AS `codigoIps`,`bdclick`.`ripslaboratorio1`.`autorizacion` AS `autorizacion`,`bdclick`.`ripslaboratorio1`.`Id` AS `Id`,`bdclick`.`ripslaboratorio1`.`fecha` AS `fecha`,`bdclick`.`ripslaboratorio1`.`actoQuirurgico` AS `actoQuirurgico`,`bdclick`.`ripslaboratorio1`.`cup` AS `cup`,`bdclick`.`ripslaboratorio1`.`cantidad` AS `cantidad`,`bdclick`.`ripslaboratorio1`.`cantidadRealizada` AS `cantidadRealizada`,`bdclick`.`ripslaboratorio1`.`copago` AS `copago`,`bdclick`.`ripslaboratorio1`.`cie` AS `cie`,`bdclick`.`ripslaboratorio1`.`telefono` AS `telefono`,`bdclick`.`ripslaboratorio1`.`celular` AS `celular`,`bdclick`.`ripslaboratorio1`.`nacimiento` AS `nacimiento`,`bdclick`.`ripslaboratorio1`.`valor` AS `valor`,`bdclick`.`ripslaboratorio1`.`nombre` AS `nombre`,`bdclick`.`ripslaboratorio1`.`codigoTarifa` AS `codigoTarifa`,`bdclick`.`ripslaboratorio1`.`procedimientoAutorizado` AS `procedimientoAutorizado`,`bdclick`.`ripslaboratorio1`.`eps` AS `eps`,`bdclick`.`ripslaboratorio1`.`ciudad` AS `ciudad`,`bdclick`.`ripslaboratorio1`.`departamento` AS `departamento`,`bdclick`.`ripslaboratorio1`.`pNombre` AS `pNombre`,`bdclick`.`ripslaboratorio1`.`sNombre` AS `sNombre`,`bdclick`.`ripslaboratorio1`.`pApellido` AS `pApellido`,`bdclick`.`ripslaboratorio1`.`sApellido` AS `sApellido`,`bdclick`.`ripslaboratorio1`.`tipoIdentidad` AS `tipoIdentidad`,`bdclick`.`ripslaboratorio1`.`tipoIdentidadDesc` AS `tipoIdentidadDesc`,`bdclick`.`ripslaboratorio1`.`codigoEntidadAdministradora` AS `codigoEntidadAdministradora`,`bdclick`.`ripslaboratorio1`.`TipoUsuario` AS `TipoUsuario`,`bdclick`.`ripslaboratorio1`.`tipoUsuarioDesc` AS `tipoUsuarioDesc`,`bdclick`.`ripslaboratorio1`.`Edad` AS `Edad`,`bdclick`.`ripslaboratorio1`.`unidadMedidaEdad` AS `unidadMedidaEdad`,`bdclick`.`ripslaboratorio1`.`sexo` AS `sexo`,`bdclick`.`ripslaboratorio1`.`zona` AS `zona`,`bdclick`.`ripslaboratorio1`.`zonaDesc` AS `zonaDesc`,`bdclick`.`ripslaboratorio1`.`codPrestadorServicio` AS `codPrestadorServicio`,`bdclick`.`ripslaboratorio1`.`razonSocial` AS `razonSocial`,`bdclick`.`ripslaboratorio1`.`tipoPrestadorServicio` AS `tipoPrestadorServicio`,`bdclick`.`ripslaboratorio1`.`IdPrestadorServicio` AS `IdPrestadorServicio`,`bdclick`.`ripslaboratorio1`.`nombreEntidadAdministradora` AS `nombreEntidadAdministradora`,`bdclick`.`ripslaboratorio1`.`nroPoliza` AS `nroPoliza`,`bdclick`.`ripslaboratorio1`.`valorComision` AS `valorComision`,`bdclick`.`ripslaboratorio1`.`valorDescuento` AS `valorDescuento`,`bdclick`.`ripslaboratorio1`.`numeroContrato` AS `numeroContrato`,`bdclick`.`ripslaboratorio1`.`tipoOrden` AS `tipoOrden`,`bdclick`.`ripslaboratorio1`.`codigoConcepto` AS `codigoConcepto`,`bdclick`.`ripslaboratorio1`.`conceptoDesc` AS `conceptoDesc`,`bdclick`.`ripslaboratorio1`.`codConsulta` AS `codConsulta`,`bdclick`.`ripslaboratorio1`.`codigoConsultaDesc` AS `codigoConsultaDesc`,`bdclick`.`ripslaboratorio1`.`finalidadd` AS `finalidadd`,`bdclick`.`ripslaboratorio1`.`finalidadDesc` AS `finalidadDesc`,`bdclick`.`ripslaboratorio1`.`causaExterna` AS `causaExterna`,`bdclick`.`ripslaboratorio1`.`causaExternaDesc` AS `causaExternaDesc`,\'1\' AS `tipoDiagnosticoPrincipal`,if((`bdclick`.`ripslaboratorio1`.`tipoOrden` = \'procedimiento\'),\'\',`bdclick`.`bdconsultalaboratorio`.`cie2`) AS `codDiagnosticoReacionado1`,if((`bdclick`.`ripslaboratorio1`.`tipoOrden` = \'procedimiento\'),\'\',`bdclick`.`bdconsultalaboratorio`.`cie3`) AS `codDiagnosticoReacionado2`,if((`bdclick`.`ripslaboratorio1`.`tipoOrden` = \'procedimiento\'),\'\',`bdclick`.`bdconsultalaboratorio`.`cie4`) AS `codDiagnosticoReacionado3`,`bdclick`.`ripslaboratorio1`.`valorCuotaModeradora` AS `valorCuotaModeradora`,`bdclick`.`ripslaboratorio1`.`ambitoProcedimiento` AS `ambitoProcedimiento`,`bdclick`.`ripslaboratorio1`.`ambitoProcedimientoDesc` AS `ambitoProcedimientoDesc`,`bdclick`.`ripslaboratorio1`.`personalAtiende` AS `personalAtiende`,`bdclick`.`ripslaboratorio1`.`personalDesc` AS `personalDesc`,if((`bdclick`.`ripslaboratorio1`.`tipoOrden` = \'procedimiento\'),`bdclick`.`bdconsultalaboratorio`.`cie2`,\'\') AS `DiagnosticoRelacionado`,if((`bdclick`.`ripslaboratorio1`.`tipoOrden` = \'procedimiento\'),`bdclick`.`bdconsultalaboratorio`.`cie4`,\'\') AS `complicaciones`,`bdclick`.`ripslaboratorio1`.`Estado` AS `Estado`,`bdclick`.`ripslaboratorio1`.`codigoDepartamento` AS `codigoDepartamento`,`bdclick`.`ripslaboratorio1`.`codigoMunicipio` AS `codigoMunicipio`,`bdclick`.`ripslaboratorio1`.`estado2` AS `estado2`,`bdclick`.`ripslaboratorio1`.`facturaNumero` AS `facturaNumero` from (`bdclick`.`ripslaboratorio1` left join `bdclick`.`bdconsultalaboratorio` on((`bdclick`.`ripslaboratorio1`.`orden` = `bdclick`.`bdconsultalaboratorio`.`orden`))))
md5=076ecad0e2c702b4357bd0ec76a42786
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:27
create-version=2
source=(select `ripslaboratorio1`.`orden` AS `orden`,`ripslaboratorio1`.`codigoIps` AS `codigoIps`,`ripslaboratorio1`.`autorizacion` AS `autorizacion`,`ripslaboratorio1`.`Id` AS `Id`,`ripslaboratorio1`.`fecha` AS `fecha`,`ripslaboratorio1`.`actoQuirurgico` AS `actoQuirurgico`,`ripslaboratorio1`.`cup` AS `cup`,`ripslaboratorio1`.`cantidad` AS `cantidad`,`ripslaboratorio1`.`cantidadRealizada` AS `cantidadRealizada`,`ripslaboratorio1`.`copago` AS `copago`,`ripslaboratorio1`.`cie` AS `cie`,`ripslaboratorio1`.`telefono` AS `telefono`,`ripslaboratorio1`.`celular` AS `celular`,`ripslaboratorio1`.`nacimiento` AS `nacimiento`,`ripslaboratorio1`.`valor` AS `valor`,`ripslaboratorio1`.`nombre` AS `nombre`,`ripslaboratorio1`.`codigoTarifa` AS `codigoTarifa`,`ripslaboratorio1`.`procedimientoAutorizado` AS `procedimientoAutorizado`,`ripslaboratorio1`.`eps` AS `eps`,`ripslaboratorio1`.`ciudad` AS `ciudad`,`ripslaboratorio1`.`departamento` AS `departamento`,`ripslaboratorio1`.`pNombre` AS `pNombre`,`ripslaboratorio1`.`sNombre` AS `sNombre`,`ripslaboratorio1`.`pApellido` AS `pApellido`,`ripslaboratorio1`.`sApellido` AS `sApellido`,`ripslaboratorio1`.`tipoIdentidad` AS `tipoIdentidad`,`ripslaboratorio1`.`tipoIdentidadDesc` AS `tipoIdentidadDesc`,`ripslaboratorio1`.`codigoEntidadAdministradora` AS `codigoEntidadAdministradora`,`ripslaboratorio1`.`TipoUsuario` AS `TipoUsuario`,`ripslaboratorio1`.`tipoUsuarioDesc` AS `tipoUsuarioDesc`,`ripslaboratorio1`.`Edad` AS `Edad`,`ripslaboratorio1`.`unidadMedidaEdad` AS `unidadMedidaEdad`,`ripslaboratorio1`.`sexo` AS `sexo`,`ripslaboratorio1`.`zona` AS `zona`,`ripslaboratorio1`.`zonaDesc` AS `zonaDesc`,`ripslaboratorio1`.`codPrestadorServicio` AS `codPrestadorServicio`,`ripslaboratorio1`.`razonSocial` AS `razonSocial`,`ripslaboratorio1`.`tipoPrestadorServicio` AS `tipoPrestadorServicio`,`ripslaboratorio1`.`IdPrestadorServicio` AS `IdPrestadorServicio`,`ripslaboratorio1`.`nombreEntidadAdministradora` AS `nombreEntidadAdministradora`,`ripslaboratorio1`.`nroPoliza` AS `nroPoliza`,`ripslaboratorio1`.`valorComision` AS `valorComision`,`ripslaboratorio1`.`valorDescuento` AS `valorDescuento`,`ripslaboratorio1`.`numeroContrato` AS `numeroContrato`,`ripslaboratorio1`.`tipoOrden` AS `tipoOrden`,`ripslaboratorio1`.`codigoConcepto` AS `codigoConcepto`,`ripslaboratorio1`.`conceptoDesc` AS `conceptoDesc`,`ripslaboratorio1`.`codConsulta` AS `codConsulta`,`ripslaboratorio1`.`codigoConsultaDesc` AS `codigoConsultaDesc`,`ripslaboratorio1`.`finalidadd` AS `finalidadd`,`ripslaboratorio1`.`finalidadDesc` AS `finalidadDesc`,`ripslaboratorio1`.`causaExterna` AS `causaExterna`,`ripslaboratorio1`.`causaExternaDesc` AS `causaExternaDesc`,\'1\' AS `tipoDiagnosticoPrincipal`,if((`ripslaboratorio1`.`tipoOrden` = \'procedimiento\'),\'\',`bdconsultalaboratorio`.`cie2`) AS `codDiagnosticoReacionado1`,if((`ripslaboratorio1`.`tipoOrden` = \'procedimiento\'),\'\',`bdconsultalaboratorio`.`cie3`) AS `codDiagnosticoReacionado2`,if((`ripslaboratorio1`.`tipoOrden` = \'procedimiento\'),\'\',`bdconsultalaboratorio`.`cie4`) AS `codDiagnosticoReacionado3`,`ripslaboratorio1`.`valorCuotaModeradora` AS `valorCuotaModeradora`,`ripslaboratorio1`.`ambitoProcedimiento` AS `ambitoProcedimiento`,`ripslaboratorio1`.`ambitoProcedimientoDesc` AS `ambitoProcedimientoDesc`,`ripslaboratorio1`.`personalAtiende` AS `personalAtiende`,`ripslaboratorio1`.`personalDesc` AS `personalDesc`,if((`ripslaboratorio1`.`tipoOrden` = \'procedimiento\'),`bdconsultalaboratorio`.`cie2`,\'\') AS `DiagnosticoRelacionado`,if((`ripslaboratorio1`.`tipoOrden` = \'procedimiento\'),`bdconsultalaboratorio`.`cie4`,\'\') AS `complicaciones`,`ripslaboratorio1`.`Estado` AS `Estado`,`ripslaboratorio1`.`codigoDepartamento` AS `codigoDepartamento`,`ripslaboratorio1`.`codigoMunicipio` AS `codigoMunicipio`,`ripslaboratorio1`.`estado2` AS `estado2`,`ripslaboratorio1`.`facturaNumero` AS `facturaNumero` from (`ripslaboratorio1` left join `bdconsultalaboratorio` on((`ripslaboratorio1`.`orden` = `bdconsultalaboratorio`.`orden`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick`.`ripslaboratorio1`.`orden` AS `orden`,`bdclick`.`ripslaboratorio1`.`codigoIps` AS `codigoIps`,`bdclick`.`ripslaboratorio1`.`autorizacion` AS `autorizacion`,`bdclick`.`ripslaboratorio1`.`Id` AS `Id`,`bdclick`.`ripslaboratorio1`.`fecha` AS `fecha`,`bdclick`.`ripslaboratorio1`.`actoQuirurgico` AS `actoQuirurgico`,`bdclick`.`ripslaboratorio1`.`cup` AS `cup`,`bdclick`.`ripslaboratorio1`.`cantidad` AS `cantidad`,`bdclick`.`ripslaboratorio1`.`cantidadRealizada` AS `cantidadRealizada`,`bdclick`.`ripslaboratorio1`.`copago` AS `copago`,`bdclick`.`ripslaboratorio1`.`cie` AS `cie`,`bdclick`.`ripslaboratorio1`.`telefono` AS `telefono`,`bdclick`.`ripslaboratorio1`.`celular` AS `celular`,`bdclick`.`ripslaboratorio1`.`nacimiento` AS `nacimiento`,`bdclick`.`ripslaboratorio1`.`valor` AS `valor`,`bdclick`.`ripslaboratorio1`.`nombre` AS `nombre`,`bdclick`.`ripslaboratorio1`.`codigoTarifa` AS `codigoTarifa`,`bdclick`.`ripslaboratorio1`.`procedimientoAutorizado` AS `procedimientoAutorizado`,`bdclick`.`ripslaboratorio1`.`eps` AS `eps`,`bdclick`.`ripslaboratorio1`.`ciudad` AS `ciudad`,`bdclick`.`ripslaboratorio1`.`departamento` AS `departamento`,`bdclick`.`ripslaboratorio1`.`pNombre` AS `pNombre`,`bdclick`.`ripslaboratorio1`.`sNombre` AS `sNombre`,`bdclick`.`ripslaboratorio1`.`pApellido` AS `pApellido`,`bdclick`.`ripslaboratorio1`.`sApellido` AS `sApellido`,`bdclick`.`ripslaboratorio1`.`tipoIdentidad` AS `tipoIdentidad`,`bdclick`.`ripslaboratorio1`.`tipoIdentidadDesc` AS `tipoIdentidadDesc`,`bdclick`.`ripslaboratorio1`.`codigoEntidadAdministradora` AS `codigoEntidadAdministradora`,`bdclick`.`ripslaboratorio1`.`TipoUsuario` AS `TipoUsuario`,`bdclick`.`ripslaboratorio1`.`tipoUsuarioDesc` AS `tipoUsuarioDesc`,`bdclick`.`ripslaboratorio1`.`Edad` AS `Edad`,`bdclick`.`ripslaboratorio1`.`unidadMedidaEdad` AS `unidadMedidaEdad`,`bdclick`.`ripslaboratorio1`.`sexo` AS `sexo`,`bdclick`.`ripslaboratorio1`.`zona` AS `zona`,`bdclick`.`ripslaboratorio1`.`zonaDesc` AS `zonaDesc`,`bdclick`.`ripslaboratorio1`.`codPrestadorServicio` AS `codPrestadorServicio`,`bdclick`.`ripslaboratorio1`.`razonSocial` AS `razonSocial`,`bdclick`.`ripslaboratorio1`.`tipoPrestadorServicio` AS `tipoPrestadorServicio`,`bdclick`.`ripslaboratorio1`.`IdPrestadorServicio` AS `IdPrestadorServicio`,`bdclick`.`ripslaboratorio1`.`nombreEntidadAdministradora` AS `nombreEntidadAdministradora`,`bdclick`.`ripslaboratorio1`.`nroPoliza` AS `nroPoliza`,`bdclick`.`ripslaboratorio1`.`valorComision` AS `valorComision`,`bdclick`.`ripslaboratorio1`.`valorDescuento` AS `valorDescuento`,`bdclick`.`ripslaboratorio1`.`numeroContrato` AS `numeroContrato`,`bdclick`.`ripslaboratorio1`.`tipoOrden` AS `tipoOrden`,`bdclick`.`ripslaboratorio1`.`codigoConcepto` AS `codigoConcepto`,`bdclick`.`ripslaboratorio1`.`conceptoDesc` AS `conceptoDesc`,`bdclick`.`ripslaboratorio1`.`codConsulta` AS `codConsulta`,`bdclick`.`ripslaboratorio1`.`codigoConsultaDesc` AS `codigoConsultaDesc`,`bdclick`.`ripslaboratorio1`.`finalidadd` AS `finalidadd`,`bdclick`.`ripslaboratorio1`.`finalidadDesc` AS `finalidadDesc`,`bdclick`.`ripslaboratorio1`.`causaExterna` AS `causaExterna`,`bdclick`.`ripslaboratorio1`.`causaExternaDesc` AS `causaExternaDesc`,\'1\' AS `tipoDiagnosticoPrincipal`,if((`bdclick`.`ripslaboratorio1`.`tipoOrden` = \'procedimiento\'),\'\',`bdclick`.`bdconsultalaboratorio`.`cie2`) AS `codDiagnosticoReacionado1`,if((`bdclick`.`ripslaboratorio1`.`tipoOrden` = \'procedimiento\'),\'\',`bdclick`.`bdconsultalaboratorio`.`cie3`) AS `codDiagnosticoReacionado2`,if((`bdclick`.`ripslaboratorio1`.`tipoOrden` = \'procedimiento\'),\'\',`bdclick`.`bdconsultalaboratorio`.`cie4`) AS `codDiagnosticoReacionado3`,`bdclick`.`ripslaboratorio1`.`valorCuotaModeradora` AS `valorCuotaModeradora`,`bdclick`.`ripslaboratorio1`.`ambitoProcedimiento` AS `ambitoProcedimiento`,`bdclick`.`ripslaboratorio1`.`ambitoProcedimientoDesc` AS `ambitoProcedimientoDesc`,`bdclick`.`ripslaboratorio1`.`personalAtiende` AS `personalAtiende`,`bdclick`.`ripslaboratorio1`.`personalDesc` AS `personalDesc`,if((`bdclick`.`ripslaboratorio1`.`tipoOrden` = \'procedimiento\'),`bdclick`.`bdconsultalaboratorio`.`cie2`,\'\') AS `DiagnosticoRelacionado`,if((`bdclick`.`ripslaboratorio1`.`tipoOrden` = \'procedimiento\'),`bdclick`.`bdconsultalaboratorio`.`cie4`,\'\') AS `complicaciones`,`bdclick`.`ripslaboratorio1`.`Estado` AS `Estado`,`bdclick`.`ripslaboratorio1`.`codigoDepartamento` AS `codigoDepartamento`,`bdclick`.`ripslaboratorio1`.`codigoMunicipio` AS `codigoMunicipio`,`bdclick`.`ripslaboratorio1`.`estado2` AS `estado2`,`bdclick`.`ripslaboratorio1`.`facturaNumero` AS `facturaNumero` from (`bdclick`.`ripslaboratorio1` left join `bdclick`.`bdconsultalaboratorio` on((`bdclick`.`ripslaboratorio1`.`orden` = `bdclick`.`bdconsultalaboratorio`.`orden`))))
mariadb-version=100135