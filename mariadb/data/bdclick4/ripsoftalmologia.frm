TYPE=VIEW
query=(select `bdclick4`.`ripsoftalmologia1`.`orden` AS `orden`,`bdclick4`.`ripsoftalmologia1`.`codigoIps` AS `codigoIps`,`bdclick4`.`ripsoftalmologia1`.`autorizacion` AS `autorizacion`,`bdclick4`.`ripsoftalmologia1`.`Id` AS `Id`,`bdclick4`.`ripsoftalmologia1`.`fecha` AS `fecha`,`bdclick4`.`ripsoftalmologia1`.`actoQuirurgico` AS `actoQuirurgico`,`bdclick4`.`ripsoftalmologia1`.`cup` AS `cup`,`bdclick4`.`ripsoftalmologia1`.`cantidad` AS `cantidad`,`bdclick4`.`ripsoftalmologia1`.`cantidadRealizada` AS `cantidadRealizada`,`bdclick4`.`ripsoftalmologia1`.`copago` AS `copago`,`bdclick4`.`ripsoftalmologia1`.`cie` AS `cie`,`bdclick4`.`ripsoftalmologia1`.`telefono` AS `telefono`,`bdclick4`.`ripsoftalmologia1`.`celular` AS `celular`,`bdclick4`.`ripsoftalmologia1`.`nacimiento` AS `nacimiento`,`bdclick4`.`ripsoftalmologia1`.`valor` AS `valor`,`bdclick4`.`ripsoftalmologia1`.`nombre` AS `nombre`,`bdclick4`.`ripsoftalmologia1`.`codigoTarifa` AS `codigoTarifa`,`bdclick4`.`ripsoftalmologia1`.`procedimientoAutorizado` AS `procedimientoAutorizado`,`bdclick4`.`ripsoftalmologia1`.`eps` AS `eps`,`bdclick4`.`ripsoftalmologia1`.`ciudad` AS `ciudad`,`bdclick4`.`ripsoftalmologia1`.`departamento` AS `departamento`,`bdclick4`.`ripsoftalmologia1`.`pNombre` AS `pNombre`,`bdclick4`.`ripsoftalmologia1`.`sNombre` AS `sNombre`,`bdclick4`.`ripsoftalmologia1`.`pApellido` AS `pApellido`,`bdclick4`.`ripsoftalmologia1`.`sApellido` AS `sApellido`,`bdclick4`.`ripsoftalmologia1`.`tipoIdentidad` AS `tipoIdentidad`,`bdclick4`.`ripsoftalmologia1`.`tipoIdentidadDesc` AS `tipoIdentidadDesc`,`bdclick4`.`ripsoftalmologia1`.`codigoEntidadAdministradora` AS `codigoEntidadAdministradora`,`bdclick4`.`ripsoftalmologia1`.`TipoUsuario` AS `TipoUsuario`,`bdclick4`.`ripsoftalmologia1`.`tipoUsuarioDesc` AS `tipoUsuarioDesc`,`bdclick4`.`ripsoftalmologia1`.`Edad` AS `Edad`,`bdclick4`.`ripsoftalmologia1`.`unidadMedidaEdad` AS `unidadMedidaEdad`,`bdclick4`.`ripsoftalmologia1`.`sexo` AS `sexo`,`bdclick4`.`ripsoftalmologia1`.`zona` AS `zona`,`bdclick4`.`ripsoftalmologia1`.`zonaDesc` AS `zonaDesc`,`bdclick4`.`ripsoftalmologia1`.`codPrestadorServicio` AS `codPrestadorServicio`,`bdclick4`.`ripsoftalmologia1`.`razonSocial` AS `razonSocial`,`bdclick4`.`ripsoftalmologia1`.`tipoPrestadorServicio` AS `tipoPrestadorServicio`,`bdclick4`.`ripsoftalmologia1`.`IdPrestadorServicio` AS `IdPrestadorServicio`,`bdclick4`.`ripsoftalmologia1`.`nombreEntidadAdministradora` AS `nombreEntidadAdministradora`,`bdclick4`.`ripsoftalmologia1`.`nroPoliza` AS `nroPoliza`,`bdclick4`.`ripsoftalmologia1`.`valorComision` AS `valorComision`,`bdclick4`.`ripsoftalmologia1`.`valorDescuento` AS `valorDescuento`,`bdclick4`.`ripsoftalmologia1`.`numeroContrato` AS `numeroContrato`,`bdclick4`.`ripsoftalmologia1`.`tipoOrden` AS `tipoOrden`,`bdclick4`.`ripsoftalmologia1`.`codigoConcepto` AS `codigoConcepto`,`bdclick4`.`ripsoftalmologia1`.`conceptoDesc` AS `conceptoDesc`,`bdclick4`.`ripsoftalmologia1`.`codConsulta` AS `codConsulta`,`bdclick4`.`ripsoftalmologia1`.`codigoConsultaDesc` AS `codigoConsultaDesc`,`bdclick4`.`ripsoftalmologia1`.`finalidadd` AS `finalidadd`,`bdclick4`.`ripsoftalmologia1`.`finalidadDesc` AS `finalidadDesc`,`bdclick4`.`ripsoftalmologia1`.`causaExterna` AS `causaExterna`,`bdclick4`.`ripsoftalmologia1`.`causaExternaDesc` AS `causaExternaDesc`,\'1\' AS `tipoDiagnosticoPrincipal`,if((`bdclick4`.`ripsoftalmologia1`.`tipoOrden` = \'procedimiento\'),\'\',`bdclick4`.`bdconsultaoftalmologia`.`cie2`) AS `codDiagnosticoReacionado1`,if((`bdclick4`.`ripsoftalmologia1`.`tipoOrden` = \'procedimiento\'),\'\',`bdclick4`.`bdconsultaoftalmologia`.`cie3`) AS `codDiagnosticoReacionado2`,if((`bdclick4`.`ripsoftalmologia1`.`tipoOrden` = \'procedimiento\'),\'\',`bdclick4`.`bdconsultaoftalmologia`.`cie4`) AS `codDiagnosticoReacionado3`,`bdclick4`.`ripsoftalmologia1`.`valorCuotaModeradora` AS `valorCuotaModeradora`,`bdclick4`.`ripsoftalmologia1`.`ambitoProcedimiento` AS `ambitoProcedimiento`,`bdclick4`.`ripsoftalmologia1`.`ambitoProcedimientoDesc` AS `ambitoProcedimientoDesc`,`bdclick4`.`ripsoftalmologia1`.`personalAtiende` AS `personalAtiende`,`bdclick4`.`ripsoftalmologia1`.`personalDesc` AS `personalDesc`,if((`bdclick4`.`ripsoftalmologia1`.`tipoOrden` = \'procedimiento\'),`bdclick4`.`bdconsultaoftalmologia`.`cie2`,\'\') AS `DiagnosticoRelacionado`,if((`bdclick4`.`ripsoftalmologia1`.`tipoOrden` = \'procedimiento\'),`bdclick4`.`bdconsultaoftalmologia`.`cie4`,\'\') AS `complicaciones`,`bdclick4`.`ripsoftalmologia1`.`Estado` AS `Estado`,`bdclick4`.`ripsoftalmologia1`.`codigoDepartamento` AS `codigoDepartamento`,`bdclick4`.`ripsoftalmologia1`.`codigoMunicipio` AS `codigoMunicipio`,`bdclick4`.`ripsoftalmologia1`.`estado2` AS `estado2`,`bdclick4`.`ripsoftalmologia1`.`facturaNumero` AS `facturaNumero` from (`bdclick4`.`ripsoftalmologia1` left join `bdclick4`.`bdconsultaoftalmologia` on((`bdclick4`.`ripsoftalmologia1`.`orden` = `bdclick4`.`bdconsultaoftalmologia`.`orden`))))
md5=cd492d2c1b8e64be3281a10582e7d772
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:31
create-version=2
source=(select `ripsoftalmologia1`.`orden` AS `orden`,`ripsoftalmologia1`.`codigoIps` AS `codigoIps`,`ripsoftalmologia1`.`autorizacion` AS `autorizacion`,`ripsoftalmologia1`.`Id` AS `Id`,`ripsoftalmologia1`.`fecha` AS `fecha`,`ripsoftalmologia1`.`actoQuirurgico` AS `actoQuirurgico`,`ripsoftalmologia1`.`cup` AS `cup`,`ripsoftalmologia1`.`cantidad` AS `cantidad`,`ripsoftalmologia1`.`cantidadRealizada` AS `cantidadRealizada`,`ripsoftalmologia1`.`copago` AS `copago`,`ripsoftalmologia1`.`cie` AS `cie`,`ripsoftalmologia1`.`telefono` AS `telefono`,`ripsoftalmologia1`.`celular` AS `celular`,`ripsoftalmologia1`.`nacimiento` AS `nacimiento`,`ripsoftalmologia1`.`valor` AS `valor`,`ripsoftalmologia1`.`nombre` AS `nombre`,`ripsoftalmologia1`.`codigoTarifa` AS `codigoTarifa`,`ripsoftalmologia1`.`procedimientoAutorizado` AS `procedimientoAutorizado`,`ripsoftalmologia1`.`eps` AS `eps`,`ripsoftalmologia1`.`ciudad` AS `ciudad`,`ripsoftalmologia1`.`departamento` AS `departamento`,`ripsoftalmologia1`.`pNombre` AS `pNombre`,`ripsoftalmologia1`.`sNombre` AS `sNombre`,`ripsoftalmologia1`.`pApellido` AS `pApellido`,`ripsoftalmologia1`.`sApellido` AS `sApellido`,`ripsoftalmologia1`.`tipoIdentidad` AS `tipoIdentidad`,`ripsoftalmologia1`.`tipoIdentidadDesc` AS `tipoIdentidadDesc`,`ripsoftalmologia1`.`codigoEntidadAdministradora` AS `codigoEntidadAdministradora`,`ripsoftalmologia1`.`TipoUsuario` AS `TipoUsuario`,`ripsoftalmologia1`.`tipoUsuarioDesc` AS `tipoUsuarioDesc`,`ripsoftalmologia1`.`Edad` AS `Edad`,`ripsoftalmologia1`.`unidadMedidaEdad` AS `unidadMedidaEdad`,`ripsoftalmologia1`.`sexo` AS `sexo`,`ripsoftalmologia1`.`zona` AS `zona`,`ripsoftalmologia1`.`zonaDesc` AS `zonaDesc`,`ripsoftalmologia1`.`codPrestadorServicio` AS `codPrestadorServicio`,`ripsoftalmologia1`.`razonSocial` AS `razonSocial`,`ripsoftalmologia1`.`tipoPrestadorServicio` AS `tipoPrestadorServicio`,`ripsoftalmologia1`.`IdPrestadorServicio` AS `IdPrestadorServicio`,`ripsoftalmologia1`.`nombreEntidadAdministradora` AS `nombreEntidadAdministradora`,`ripsoftalmologia1`.`nroPoliza` AS `nroPoliza`,`ripsoftalmologia1`.`valorComision` AS `valorComision`,`ripsoftalmologia1`.`valorDescuento` AS `valorDescuento`,`ripsoftalmologia1`.`numeroContrato` AS `numeroContrato`,`ripsoftalmologia1`.`tipoOrden` AS `tipoOrden`,`ripsoftalmologia1`.`codigoConcepto` AS `codigoConcepto`,`ripsoftalmologia1`.`conceptoDesc` AS `conceptoDesc`,`ripsoftalmologia1`.`codConsulta` AS `codConsulta`,`ripsoftalmologia1`.`codigoConsultaDesc` AS `codigoConsultaDesc`,`ripsoftalmologia1`.`finalidadd` AS `finalidadd`,`ripsoftalmologia1`.`finalidadDesc` AS `finalidadDesc`,`ripsoftalmologia1`.`causaExterna` AS `causaExterna`,`ripsoftalmologia1`.`causaExternaDesc` AS `causaExternaDesc`,\'1\' AS `tipoDiagnosticoPrincipal`,if((`ripsoftalmologia1`.`tipoOrden` = \'procedimiento\'),\'\',`bdconsultaoftalmologia`.`cie2`) AS `codDiagnosticoReacionado1`,if((`ripsoftalmologia1`.`tipoOrden` = \'procedimiento\'),\'\',`bdconsultaoftalmologia`.`cie3`) AS `codDiagnosticoReacionado2`,if((`ripsoftalmologia1`.`tipoOrden` = \'procedimiento\'),\'\',`bdconsultaoftalmologia`.`cie4`) AS `codDiagnosticoReacionado3`,`ripsoftalmologia1`.`valorCuotaModeradora` AS `valorCuotaModeradora`,`ripsoftalmologia1`.`ambitoProcedimiento` AS `ambitoProcedimiento`,`ripsoftalmologia1`.`ambitoProcedimientoDesc` AS `ambitoProcedimientoDesc`,`ripsoftalmologia1`.`personalAtiende` AS `personalAtiende`,`ripsoftalmologia1`.`personalDesc` AS `personalDesc`,if((`ripsoftalmologia1`.`tipoOrden` = \'procedimiento\'),`bdconsultaoftalmologia`.`cie2`,\'\') AS `DiagnosticoRelacionado`,if((`ripsoftalmologia1`.`tipoOrden` = \'procedimiento\'),`bdconsultaoftalmologia`.`cie4`,\'\') AS `complicaciones`,`ripsoftalmologia1`.`Estado` AS `Estado`,`ripsoftalmologia1`.`codigoDepartamento` AS `codigoDepartamento`,`ripsoftalmologia1`.`codigoMunicipio` AS `codigoMunicipio`,`ripsoftalmologia1`.`estado2` AS `estado2`,`ripsoftalmologia1`.`facturaNumero` AS `facturaNumero` from (`ripsoftalmologia1` left join `bdconsultaoftalmologia` on((`ripsoftalmologia1`.`orden` = `bdconsultaoftalmologia`.`orden`))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick4`.`ripsoftalmologia1`.`orden` AS `orden`,`bdclick4`.`ripsoftalmologia1`.`codigoIps` AS `codigoIps`,`bdclick4`.`ripsoftalmologia1`.`autorizacion` AS `autorizacion`,`bdclick4`.`ripsoftalmologia1`.`Id` AS `Id`,`bdclick4`.`ripsoftalmologia1`.`fecha` AS `fecha`,`bdclick4`.`ripsoftalmologia1`.`actoQuirurgico` AS `actoQuirurgico`,`bdclick4`.`ripsoftalmologia1`.`cup` AS `cup`,`bdclick4`.`ripsoftalmologia1`.`cantidad` AS `cantidad`,`bdclick4`.`ripsoftalmologia1`.`cantidadRealizada` AS `cantidadRealizada`,`bdclick4`.`ripsoftalmologia1`.`copago` AS `copago`,`bdclick4`.`ripsoftalmologia1`.`cie` AS `cie`,`bdclick4`.`ripsoftalmologia1`.`telefono` AS `telefono`,`bdclick4`.`ripsoftalmologia1`.`celular` AS `celular`,`bdclick4`.`ripsoftalmologia1`.`nacimiento` AS `nacimiento`,`bdclick4`.`ripsoftalmologia1`.`valor` AS `valor`,`bdclick4`.`ripsoftalmologia1`.`nombre` AS `nombre`,`bdclick4`.`ripsoftalmologia1`.`codigoTarifa` AS `codigoTarifa`,`bdclick4`.`ripsoftalmologia1`.`procedimientoAutorizado` AS `procedimientoAutorizado`,`bdclick4`.`ripsoftalmologia1`.`eps` AS `eps`,`bdclick4`.`ripsoftalmologia1`.`ciudad` AS `ciudad`,`bdclick4`.`ripsoftalmologia1`.`departamento` AS `departamento`,`bdclick4`.`ripsoftalmologia1`.`pNombre` AS `pNombre`,`bdclick4`.`ripsoftalmologia1`.`sNombre` AS `sNombre`,`bdclick4`.`ripsoftalmologia1`.`pApellido` AS `pApellido`,`bdclick4`.`ripsoftalmologia1`.`sApellido` AS `sApellido`,`bdclick4`.`ripsoftalmologia1`.`tipoIdentidad` AS `tipoIdentidad`,`bdclick4`.`ripsoftalmologia1`.`tipoIdentidadDesc` AS `tipoIdentidadDesc`,`bdclick4`.`ripsoftalmologia1`.`codigoEntidadAdministradora` AS `codigoEntidadAdministradora`,`bdclick4`.`ripsoftalmologia1`.`TipoUsuario` AS `TipoUsuario`,`bdclick4`.`ripsoftalmologia1`.`tipoUsuarioDesc` AS `tipoUsuarioDesc`,`bdclick4`.`ripsoftalmologia1`.`Edad` AS `Edad`,`bdclick4`.`ripsoftalmologia1`.`unidadMedidaEdad` AS `unidadMedidaEdad`,`bdclick4`.`ripsoftalmologia1`.`sexo` AS `sexo`,`bdclick4`.`ripsoftalmologia1`.`zona` AS `zona`,`bdclick4`.`ripsoftalmologia1`.`zonaDesc` AS `zonaDesc`,`bdclick4`.`ripsoftalmologia1`.`codPrestadorServicio` AS `codPrestadorServicio`,`bdclick4`.`ripsoftalmologia1`.`razonSocial` AS `razonSocial`,`bdclick4`.`ripsoftalmologia1`.`tipoPrestadorServicio` AS `tipoPrestadorServicio`,`bdclick4`.`ripsoftalmologia1`.`IdPrestadorServicio` AS `IdPrestadorServicio`,`bdclick4`.`ripsoftalmologia1`.`nombreEntidadAdministradora` AS `nombreEntidadAdministradora`,`bdclick4`.`ripsoftalmologia1`.`nroPoliza` AS `nroPoliza`,`bdclick4`.`ripsoftalmologia1`.`valorComision` AS `valorComision`,`bdclick4`.`ripsoftalmologia1`.`valorDescuento` AS `valorDescuento`,`bdclick4`.`ripsoftalmologia1`.`numeroContrato` AS `numeroContrato`,`bdclick4`.`ripsoftalmologia1`.`tipoOrden` AS `tipoOrden`,`bdclick4`.`ripsoftalmologia1`.`codigoConcepto` AS `codigoConcepto`,`bdclick4`.`ripsoftalmologia1`.`conceptoDesc` AS `conceptoDesc`,`bdclick4`.`ripsoftalmologia1`.`codConsulta` AS `codConsulta`,`bdclick4`.`ripsoftalmologia1`.`codigoConsultaDesc` AS `codigoConsultaDesc`,`bdclick4`.`ripsoftalmologia1`.`finalidadd` AS `finalidadd`,`bdclick4`.`ripsoftalmologia1`.`finalidadDesc` AS `finalidadDesc`,`bdclick4`.`ripsoftalmologia1`.`causaExterna` AS `causaExterna`,`bdclick4`.`ripsoftalmologia1`.`causaExternaDesc` AS `causaExternaDesc`,\'1\' AS `tipoDiagnosticoPrincipal`,if((`bdclick4`.`ripsoftalmologia1`.`tipoOrden` = \'procedimiento\'),\'\',`bdclick4`.`bdconsultaoftalmologia`.`cie2`) AS `codDiagnosticoReacionado1`,if((`bdclick4`.`ripsoftalmologia1`.`tipoOrden` = \'procedimiento\'),\'\',`bdclick4`.`bdconsultaoftalmologia`.`cie3`) AS `codDiagnosticoReacionado2`,if((`bdclick4`.`ripsoftalmologia1`.`tipoOrden` = \'procedimiento\'),\'\',`bdclick4`.`bdconsultaoftalmologia`.`cie4`) AS `codDiagnosticoReacionado3`,`bdclick4`.`ripsoftalmologia1`.`valorCuotaModeradora` AS `valorCuotaModeradora`,`bdclick4`.`ripsoftalmologia1`.`ambitoProcedimiento` AS `ambitoProcedimiento`,`bdclick4`.`ripsoftalmologia1`.`ambitoProcedimientoDesc` AS `ambitoProcedimientoDesc`,`bdclick4`.`ripsoftalmologia1`.`personalAtiende` AS `personalAtiende`,`bdclick4`.`ripsoftalmologia1`.`personalDesc` AS `personalDesc`,if((`bdclick4`.`ripsoftalmologia1`.`tipoOrden` = \'procedimiento\'),`bdclick4`.`bdconsultaoftalmologia`.`cie2`,\'\') AS `DiagnosticoRelacionado`,if((`bdclick4`.`ripsoftalmologia1`.`tipoOrden` = \'procedimiento\'),`bdclick4`.`bdconsultaoftalmologia`.`cie4`,\'\') AS `complicaciones`,`bdclick4`.`ripsoftalmologia1`.`Estado` AS `Estado`,`bdclick4`.`ripsoftalmologia1`.`codigoDepartamento` AS `codigoDepartamento`,`bdclick4`.`ripsoftalmologia1`.`codigoMunicipio` AS `codigoMunicipio`,`bdclick4`.`ripsoftalmologia1`.`estado2` AS `estado2`,`bdclick4`.`ripsoftalmologia1`.`facturaNumero` AS `facturaNumero` from (`bdclick4`.`ripsoftalmologia1` left join `bdclick4`.`bdconsultaoftalmologia` on((`bdclick4`.`ripsoftalmologia1`.`orden` = `bdclick4`.`bdconsultaoftalmologia`.`orden`))))
mariadb-version=100135