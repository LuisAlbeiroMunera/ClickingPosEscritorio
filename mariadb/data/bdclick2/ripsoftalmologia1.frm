TYPE=VIEW
query=(select `ordenof`.`id` AS `orden`,`ordenof`.`codigoIps` AS `codigoIps`,`ordenof`.`autorizacion` AS `autorizacion`,`bdclick2`.`bdterceros`.`id` AS `Id`,`ordenof`.`fecha` AS `fecha`,`ordenof`.`actoQuirurgico` AS `actoQuirurgico`,`ordenof`.`cup` AS `cup`,`ordenof`.`cantidad` AS `cantidad`,`ordenof`.`cantidadRealizada` AS `cantidadRealizada`,`ordenof`.`copago` AS `copago`,`ordenof`.`cie` AS `cie`,`bdclick2`.`bdterceros`.`telefono` AS `telefono`,`bdclick2`.`bdterceros`.`celular` AS `celular`,`bdclick2`.`bdterceros`.`nacimiento` AS `nacimiento`,`ordenof`.`valor` AS `valor`,`bdclick2`.`bdterceros`.`nombre` AS `nombre`,`ordenof`.`cup` AS `codigoTarifa`,`bdclick2`.`bdproductos`.`Descripcion` AS `procedimientoAutorizado`,`bdclick2`.`bdterceros`.`eps` AS `eps`,`bdclick2`.`bdterceros`.`ciudad` AS `ciudad`,`bdclick2`.`bdterceros`.`departamento` AS `departamento`,`bdclick2`.`bdterceros`.`pNombre` AS `pNombre`,`bdclick2`.`bdterceros`.`sNombre` AS `sNombre`,`bdclick2`.`bdterceros`.`pApellido` AS `pApellido`,`bdclick2`.`bdterceros`.`sApellido` AS `sApellido`,if((`bdclick2`.`bdterceros`.`tipo` like \'*dula de extranjer*\'),\'CE\',if((`bdclick2`.`bdterceros`.`tipo` like \'*dula*\'),\'CC\',if((`bdclick2`.`bdterceros`.`tipo` = \'Pasaporte\'),\'PA\',if((`bdclick2`.`bdterceros`.`tipo` = \'Registro civil\'),\'RC\',if((`bdclick2`.`bdterceros`.`tipo` = \'Tarjeta de identidad\'),\'TI\',if((`bdclick2`.`bdterceros`.`tipo` like \'*Adulto sin identificaci*\'),\'AS\',if((`bdclick2`.`bdterceros`.`tipo` like \'*Menor sin identificaci*\'),\'MS\',if((`bdclick2`.`bdterceros`.`tipo` like \'*nico de identificaci*\'),\'NU\',\'\')))))))) AS `tipoIdentidad`,`bdclick2`.`bdterceros`.`tipo` AS `tipoIdentidadDesc`,if((`bdclick2`.`bdepsprecargados`.`codigoProteccionSocial` = \'000001\'),\'\',`bdclick2`.`bdepsprecargados`.`codigoProteccionSocial`) AS `codigoEntidadAdministradora`,if((`bdclick2`.`bdterceros`.`regimen` = \'Contributivo\'),\'1\',if((`bdclick2`.`bdterceros`.`regimen` = \'Subsidiado\'),\'2\',if((`bdclick2`.`bdterceros`.`regimen` = \'Vinculado\'),\'3\',if((`bdclick2`.`bdterceros`.`regimen` = \'Particular\'),\'4\',if((`bdclick2`.`bdterceros`.`regimen` = \'Otro\'),\'5\',\'\'))))) AS `TipoUsuario`,`bdclick2`.`bdterceros`.`regimen` AS `tipoUsuarioDesc`,cast(((cast(now() as date) - `bdclick2`.`bdterceros`.`nacimiento`) / 365) as signed) AS `Edad`,if(((year(cast(now() as date)) - year(`bdclick2`.`bdterceros`.`nacimiento`)) = 0),if(((month(cast(now() as date)) - month(`bdclick2`.`bdterceros`.`nacimiento`)) = 0),\'3\',\'2\'),\'1\') AS `unidadMedidaEdad`,if((`bdclick2`.`bdterceros`.`sexo` = \'Masculino\'),\'M\',\'F\') AS `sexo`,if((`bdclick2`.`bdterceros`.`zona` = \'Urbana\'),\'U\',\'R\') AS `zona`,`bdclick2`.`bdterceros`.`zona` AS `zonaDesc`,`bdclick2`.`bdmaestra`.`codPrestadorServicio` AS `codPrestadorServicio`,`bdclick2`.`bdmaestra`.`d1` AS `razonSocial`,`bdclick2`.`bdmaestra`.`tipoIdPrestadorServicio` AS `tipoPrestadorServicio`,`bdclick2`.`bdmaestra`.`d2` AS `IdPrestadorServicio`,if((`bdclick2`.`bdepsprecargados`.`codigoProteccionSocial` = \'000001\'),\'\',`bdclick2`.`bdepsprecargados`.`nombre`) AS `nombreEntidadAdministradora`,`ordenof`.`poliza` AS `nroPoliza`,`ordenof`.`comision` AS `valorComision`,`ordenof`.`descuento` AS `valorDescuento`,`bdclick2`.`bdepsprecargados`.`contrato` AS `numeroContrato`,`ordenof`.`tipo` AS `tipoOrden`,if((`ordenof`.`concepto` = \'Consultas\'),\'01\',if((`ordenof`.`concepto` like \'Procedimientos de diagn*\'),\'02\',if((`ordenof`.`concepto` like \'*uticos no quir*\'),\'03\',if((`ordenof`.`concepto` like \'Procedimientos terap*\'),\'04\',if((`ordenof`.`concepto` like \'Procedimientos de promoci*\'),\'05\',if((`ordenof`.`concepto` = \'Estancias\'),\'06\',if((`ordenof`.`concepto` = \'Honorarios\'),\'07\',if((`ordenof`.`concepto` = \'Derechos de sala\'),\'08\',if((`ordenof`.`concepto` = \'Materiales e insumos\'),\'09\',if((`ordenof`.`concepto` = \'Banco de sangre\'),\'10\',if((`ordenof`.`concepto` like \'*tesis y*\'),\'11\',if((`ordenof`.`concepto` = \'Medicamentos POS\'),\'12\',if((`ordenof`.`concepto` = \'Medicamentos no POS\'),\'13\',if((`ordenof`.`concepto` = \'Traslado de pacientes\'),\'14\',\'\')))))))))))))) AS `codigoConcepto`,`ordenof`.`concepto` AS `conceptoDesc`,if((`ordenof`.`codigoConsulta` = \'Consulta de Medicina General electiva\'),\'890201\',if((`ordenof`.`codigoConsulta` = \'Consulta de Medicina Especializada electiva\'),\'890202\',if((`ordenof`.`codigoConsulta` = \'Consulta de Medicina General de control\'),\'890301\',if((`ordenof`.`codigoConsulta` = \'Consulta de Medicina Especializada de control\'),\'890302\',if((`ordenof`.`codigoConsulta` = \'Consulta odontologica especializada de control\'),\'890304\',if((`ordenof`.`codigoConsulta` = \'Consulta odontologica general de control\'),\'890303\',if((`ordenof`.`codigoConsulta` = \'Consulta de odontologia general\'),\'890703\',if((`ordenof`.`codigoConsulta` = \'Consulta de odontologia especializada\'),\'890704\',\'\')))))))) AS `codConsulta`,`ordenof`.`codigoConsulta` AS `codigoConsultaDesc`,if((`ordenof`.`tipo` = \'procedimiento\'),if((`ordenof`.`finalidad` like \'Diagn*\'),\'1\',if((`ordenof`.`finalidad` like \'Terap*\'),\'2\',if((`ordenof`.`finalidad` like \'Protecci*\'),\'3\',if((`ordenof`.`finalidad` like \'*n temprana de enfermedad general\'),\'4\',if((`ordenof`.`finalidad` like \'*n temprana de enfermedad profesional\'),\'5\',\'\'))))),if((`ordenof`.`finalidad` like \'*n del parto (puerperio)\'),\'01\',if((`ordenof`.`finalidad` like \'*n del reci*\'),\'02\',if((`ordenof`.`finalidad` like \'*n en planificaci*\'),\'03\',if((`ordenof`.`finalidad` like \'No aplica\'),\'10\',if((`ordenof`.`finalidad` like \'Detecci*n de alteraci*n del*\'),\'05\',if((`ordenof`.`finalidad` like \'Detecci*n de alteraciones del embarazo\'),\'06\',if((`ordenof`.`finalidad` like \'Detecci*n de alteraciones del adulto\'),\'07\',if((`ordenof`.`finalidad` like \'Detecci*n de alteraciones de agudeza visual\'),\'08\',if((`ordenof`.`finalidad` like \'Detecci*n de enfermedad profesional\'),\'09\',if((`ordenof`.`finalidad` like \'*n de alteraciones de*\'),\'04\',\'\'))))))))))) AS `finalidadd`,`ordenof`.`finalidad` AS `finalidadDesc`,if((`ordenof`.`causa` = \'Accidente de trabajo\'),\'01\',if((`ordenof`.`causa` like \'Accidente de tr*nsito\'),\'02\',if((`ordenof`.`causa` like \'Accidente r*bico\'),\'03\',if((`ordenof`.`causa` like \'Accidente of*dico\'),\'04\',if((`ordenof`.`causa` = \'Otro tipo de accidente\'),\'05\',if((`ordenof`.`causa` like \'Evento catastr*fico\'),\'06\',if((`ordenof`.`causa` like \'Lesi*n por agresi*n\'),\'07\',if((`ordenof`.`causa` like \'Lesi*n auto infligida\'),\'08\',if((`ordenof`.`causa` like \'Sospecha de maltrato f*sico\'),\'09\',if((`ordenof`.`causa` = \'Sospecha de abuso sexual\'),\'10\',if((`ordenof`.`causa` = \'Sospecha de violencia sexual\'),\'11\',if((`ordenof`.`causa` = \'Sospecha de maltrato emocional\'),\'12\',if((`ordenof`.`causa` = \'Enfermedad general\'),\'13\',if((`ordenof`.`causa` = \'Enfermedad profesional\'),\'14\',\'15\')))))))))))))) AS `causaExterna`,`ordenof`.`causa` AS `causaExternaDesc`,`ordenof`.`cuota` AS `valorCuotaModeradora`,if((`ordenof`.`ambito` = \'Ambulatorio\'),\'1\',if((`ordenof`.`ambito` = \'Hospitalario\'),\'2\',\'3\')) AS `ambitoProcedimiento`,`ordenof`.`ambito` AS `ambitoProcedimientoDesc`,if((`ordenof`.`personal` like \'M*dico (A) especialista\'),\'1\',if((`ordenof`.`personal` like \'M*dico (a) general\'),\'2\',if((`ordenof`.`personal` = \'Enfermera (o)\'),\'3\',if((`ordenof`.`personal` like \'Auxiliar de enfermer*a\'),\'4\',if((`ordenof`.`personal` = \'Otro\'),\'5\',\'\'))))) AS `personalAtiende`,`ordenof`.`personal` AS `personalDesc`,`ordenof`.`Estado` AS `Estado`,`bdclick2`.`bdregiones`.`codigoDepartamento` AS `codigoDepartamento`,`bdclick2`.`bdregiones`.`codigoMunicipio` AS `codigoMunicipio`,`ordenof`.`estado2` AS `estado2`,`ordenof`.`orden` AS `facturaNumero` from (`bdclick2`.`bdmaestra` join ((`bdclick2`.`bdproductos` join `bdclick2`.`bdordenserviciooftalmologia` `ordenof` on((`bdclick2`.`bdproductos`.`Codigo` = `ordenof`.`acobrar`))) join ((`bdclick2`.`bdterceros` join `bdclick2`.`bdepsprecargados` on((`bdclick2`.`bdterceros`.`eps` = `bdclick2`.`bdepsprecargados`.`Id`))) join `bdclick2`.`bdregiones` on(((`bdclick2`.`bdterceros`.`ciudad` = `bdclick2`.`bdregiones`.`nombreMunicipio`) and (`bdclick2`.`bdterceros`.`departamento` = `bdclick2`.`bdregiones`.`nombreDepartamento`)))) on((`ordenof`.`paciente` = `bdclick2`.`bdterceros`.`id`)))))
md5=a3a5fc170d617098f831fc0f817cf79a
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:48
create-version=2
source=(select `ordenof`.`id` AS `orden`,`ordenof`.`codigoIps` AS `codigoIps`,`ordenof`.`autorizacion` AS `autorizacion`,`bdterceros`.`id` AS `Id`,`ordenof`.`fecha` AS `fecha`,`ordenof`.`actoQuirurgico` AS `actoQuirurgico`,`ordenof`.`cup` AS `cup`,`ordenof`.`cantidad` AS `cantidad`,`ordenof`.`cantidadRealizada` AS `cantidadRealizada`,`ordenof`.`copago` AS `copago`,`ordenof`.`cie` AS `cie`,`bdterceros`.`telefono` AS `telefono`,`bdterceros`.`celular` AS `celular`,`bdterceros`.`nacimiento` AS `nacimiento`,`ordenof`.`valor` AS `valor`,`bdterceros`.`nombre` AS `nombre`,`ordenof`.`cup` AS `codigoTarifa`,`bdproductos`.`Descripcion` AS `procedimientoAutorizado`,`bdterceros`.`eps` AS `eps`,`bdterceros`.`ciudad` AS `ciudad`,`bdterceros`.`departamento` AS `departamento`,`bdterceros`.`pNombre` AS `pNombre`,`bdterceros`.`sNombre` AS `sNombre`,`bdterceros`.`pApellido` AS `pApellido`,`bdterceros`.`sApellido` AS `sApellido`,if((`bdterceros`.`tipo` like \'*dula de extranjer*\'),\'CE\',if((`bdterceros`.`tipo` like \'*dula*\'),\'CC\',if((`bdterceros`.`tipo` = \'Pasaporte\'),\'PA\',if((`bdterceros`.`tipo` = \'Registro civil\'),\'RC\',if((`bdterceros`.`tipo` = \'Tarjeta de identidad\'),\'TI\',if((`bdterceros`.`tipo` like \'*Adulto sin identificaci*\'),\'AS\',if((`bdterceros`.`tipo` like \'*Menor sin identificaci*\'),\'MS\',if((`bdterceros`.`tipo` like \'*nico de identificaci*\'),\'NU\',\'\')))))))) AS `tipoIdentidad`,`bdterceros`.`tipo` AS `tipoIdentidadDesc`,if((`bdepsprecargados`.`codigoProteccionSocial` = \'000001\'),\'\',`bdepsprecargados`.`codigoProteccionSocial`) AS `codigoEntidadAdministradora`,if((`bdterceros`.`regimen` = \'Contributivo\'),\'1\',if((`bdterceros`.`regimen` = \'Subsidiado\'),\'2\',if((`bdterceros`.`regimen` = \'Vinculado\'),\'3\',if((`bdterceros`.`regimen` = \'Particular\'),\'4\',if((`bdterceros`.`regimen` = \'Otro\'),\'5\',\'\'))))) AS `TipoUsuario`,`bdterceros`.`regimen` AS `tipoUsuarioDesc`,cast(((cast(now() as date) - `bdterceros`.`nacimiento`) / 365) as signed) AS `Edad`,if(((year(cast(now() as date)) - year(`bdterceros`.`nacimiento`)) = 0),if(((month(cast(now() as date)) - month(`bdterceros`.`nacimiento`)) = 0),\'3\',\'2\'),\'1\') AS `unidadMedidaEdad`,if((`bdterceros`.`sexo` = \'Masculino\'),\'M\',\'F\') AS `sexo`,if((`bdterceros`.`zona` = \'Urbana\'),\'U\',\'R\') AS `zona`,`bdterceros`.`zona` AS `zonaDesc`,`bdmaestra`.`codPrestadorServicio` AS `codPrestadorServicio`,`bdmaestra`.`d1` AS `razonSocial`,`bdmaestra`.`tipoIdPrestadorServicio` AS `tipoPrestadorServicio`,`bdmaestra`.`d2` AS `IdPrestadorServicio`,if((`bdepsprecargados`.`codigoProteccionSocial` = \'000001\'),\'\',`bdepsprecargados`.`nombre`) AS `nombreEntidadAdministradora`,`ordenof`.`poliza` AS `nroPoliza`,`ordenof`.`comision` AS `valorComision`,`ordenof`.`descuento` AS `valorDescuento`,`bdepsprecargados`.`contrato` AS `numeroContrato`,`ordenof`.`tipo` AS `tipoOrden`,if((`ordenof`.`concepto` = \'Consultas\'),\'01\',if((`ordenof`.`concepto` like \'Procedimientos de diagn*\'),\'02\',if((`ordenof`.`concepto` like \'*uticos no quir*\'),\'03\',if((`ordenof`.`concepto` like \'Procedimientos terap*\'),\'04\',if((`ordenof`.`concepto` like \'Procedimientos de promoci*\'),\'05\',if((`ordenof`.`concepto` = \'Estancias\'),\'06\',if((`ordenof`.`concepto` = \'Honorarios\'),\'07\',if((`ordenof`.`concepto` = \'Derechos de sala\'),\'08\',if((`ordenof`.`concepto` = \'Materiales e insumos\'),\'09\',if((`ordenof`.`concepto` = \'Banco de sangre\'),\'10\',if((`ordenof`.`concepto` like \'*tesis y*\'),\'11\',if((`ordenof`.`concepto` = \'Medicamentos POS\'),\'12\',if((`ordenof`.`concepto` = \'Medicamentos no POS\'),\'13\',if((`ordenof`.`concepto` = \'Traslado de pacientes\'),\'14\',\'\')))))))))))))) AS `codigoConcepto`,`ordenof`.`concepto` AS `conceptoDesc`,if((`ordenof`.`codigoConsulta` = \'Consulta de Medicina General electiva\'),\'890201\',if((`ordenof`.`codigoConsulta` = \'Consulta de Medicina Especializada electiva\'),\'890202\',if((`ordenof`.`codigoConsulta` = \'Consulta de Medicina General de control\'),\'890301\',if((`ordenof`.`codigoConsulta` = \'Consulta de Medicina Especializada de control\'),\'890302\',if((`ordenof`.`codigoConsulta` = \'Consulta odontologica especializada de control\'),\'890304\',if((`ordenof`.`codigoConsulta` = \'Consulta odontologica general de control\'),\'890303\',if((`ordenof`.`codigoConsulta` = \'Consulta de odontologia general\'),\'890703\',if((`ordenof`.`codigoConsulta` = \'Consulta de odontologia especializada\'),\'890704\',\'\')))))))) AS `codConsulta`,`ordenof`.`codigoConsulta` AS `codigoConsultaDesc`,if((`ordenof`.`tipo` = \'procedimiento\'),if((`ordenof`.`finalidad` like \'Diagn*\'),\'1\',if((`ordenof`.`finalidad` like \'Terap*\'),\'2\',if((`ordenof`.`finalidad` like \'Protecci*\'),\'3\',if((`ordenof`.`finalidad` like \'*n temprana de enfermedad general\'),\'4\',if((`ordenof`.`finalidad` like \'*n temprana de enfermedad profesional\'),\'5\',\'\'))))),if((`ordenof`.`finalidad` like \'*n del parto (puerperio)\'),\'01\',if((`ordenof`.`finalidad` like \'*n del reci*\'),\'02\',if((`ordenof`.`finalidad` like \'*n en planificaci*\'),\'03\',if((`ordenof`.`finalidad` like \'No aplica\'),\'10\',if((`ordenof`.`finalidad` like \'Detecci*n de alteraci*n del*\'),\'05\',if((`ordenof`.`finalidad` like \'Detecci*n de alteraciones del embarazo\'),\'06\',if((`ordenof`.`finalidad` like \'Detecci*n de alteraciones del adulto\'),\'07\',if((`ordenof`.`finalidad` like \'Detecci*n de alteraciones de agudeza visual\'),\'08\',if((`ordenof`.`finalidad` like \'Detecci*n de enfermedad profesional\'),\'09\',if((`ordenof`.`finalidad` like \'*n de alteraciones de*\'),\'04\',\'\'))))))))))) AS `finalidadd`,`ordenof`.`finalidad` AS `finalidadDesc`,if((`ordenof`.`causa` = \'Accidente de trabajo\'),\'01\',if((`ordenof`.`causa` like \'Accidente de tr*nsito\'),\'02\',if((`ordenof`.`causa` like \'Accidente r*bico\'),\'03\',if((`ordenof`.`causa` like \'Accidente of*dico\'),\'04\',if((`ordenof`.`causa` = \'Otro tipo de accidente\'),\'05\',if((`ordenof`.`causa` like \'Evento catastr*fico\'),\'06\',if((`ordenof`.`causa` like \'Lesi*n por agresi*n\'),\'07\',if((`ordenof`.`causa` like \'Lesi*n auto infligida\'),\'08\',if((`ordenof`.`causa` like \'Sospecha de maltrato f*sico\'),\'09\',if((`ordenof`.`causa` = \'Sospecha de abuso sexual\'),\'10\',if((`ordenof`.`causa` = \'Sospecha de violencia sexual\'),\'11\',if((`ordenof`.`causa` = \'Sospecha de maltrato emocional\'),\'12\',if((`ordenof`.`causa` = \'Enfermedad general\'),\'13\',if((`ordenof`.`causa` = \'Enfermedad profesional\'),\'14\',\'15\')))))))))))))) AS `causaExterna`,`ordenof`.`causa` AS `causaExternaDesc`,`ordenof`.`cuota` AS `valorCuotaModeradora`,if((`ordenof`.`ambito` = \'Ambulatorio\'),\'1\',if((`ordenof`.`ambito` = \'Hospitalario\'),\'2\',\'3\')) AS `ambitoProcedimiento`,`ordenof`.`ambito` AS `ambitoProcedimientoDesc`,if((`ordenof`.`personal` like \'M*dico (A) especialista\'),\'1\',if((`ordenof`.`personal` like \'M*dico (a) general\'),\'2\',if((`ordenof`.`personal` = \'Enfermera (o)\'),\'3\',if((`ordenof`.`personal` like \'Auxiliar de enfermer*a\'),\'4\',if((`ordenof`.`personal` = \'Otro\'),\'5\',\'\'))))) AS `personalAtiende`,`ordenof`.`personal` AS `personalDesc`,`ordenof`.`Estado` AS `Estado`,`bdregiones`.`codigoDepartamento` AS `codigoDepartamento`,`bdregiones`.`codigoMunicipio` AS `codigoMunicipio`,`ordenof`.`estado2` AS `estado2`,`ordenof`.`orden` AS `facturaNumero` from (`bdmaestra` join ((`bdproductos` join `bdordenserviciooftalmologia` `ordenof` on((`bdproductos`.`Codigo` = `ordenof`.`acobrar`))) join ((`bdterceros` join `bdepsprecargados` on((`bdterceros`.`eps` = `bdepsprecargados`.`Id`))) join `bdregiones` on(((`bdterceros`.`ciudad` = `bdregiones`.`nombreMunicipio`) and (`bdterceros`.`departamento` = `bdregiones`.`nombreDepartamento`)))) on((`ordenof`.`paciente` = `bdterceros`.`id`)))))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `ordenof`.`id` AS `orden`,`ordenof`.`codigoIps` AS `codigoIps`,`ordenof`.`autorizacion` AS `autorizacion`,`bdclick2`.`bdterceros`.`id` AS `Id`,`ordenof`.`fecha` AS `fecha`,`ordenof`.`actoQuirurgico` AS `actoQuirurgico`,`ordenof`.`cup` AS `cup`,`ordenof`.`cantidad` AS `cantidad`,`ordenof`.`cantidadRealizada` AS `cantidadRealizada`,`ordenof`.`copago` AS `copago`,`ordenof`.`cie` AS `cie`,`bdclick2`.`bdterceros`.`telefono` AS `telefono`,`bdclick2`.`bdterceros`.`celular` AS `celular`,`bdclick2`.`bdterceros`.`nacimiento` AS `nacimiento`,`ordenof`.`valor` AS `valor`,`bdclick2`.`bdterceros`.`nombre` AS `nombre`,`ordenof`.`cup` AS `codigoTarifa`,`bdclick2`.`bdproductos`.`Descripcion` AS `procedimientoAutorizado`,`bdclick2`.`bdterceros`.`eps` AS `eps`,`bdclick2`.`bdterceros`.`ciudad` AS `ciudad`,`bdclick2`.`bdterceros`.`departamento` AS `departamento`,`bdclick2`.`bdterceros`.`pNombre` AS `pNombre`,`bdclick2`.`bdterceros`.`sNombre` AS `sNombre`,`bdclick2`.`bdterceros`.`pApellido` AS `pApellido`,`bdclick2`.`bdterceros`.`sApellido` AS `sApellido`,if((`bdclick2`.`bdterceros`.`tipo` like \'*dula de extranjer*\'),\'CE\',if((`bdclick2`.`bdterceros`.`tipo` like \'*dula*\'),\'CC\',if((`bdclick2`.`bdterceros`.`tipo` = \'Pasaporte\'),\'PA\',if((`bdclick2`.`bdterceros`.`tipo` = \'Registro civil\'),\'RC\',if((`bdclick2`.`bdterceros`.`tipo` = \'Tarjeta de identidad\'),\'TI\',if((`bdclick2`.`bdterceros`.`tipo` like \'*Adulto sin identificaci*\'),\'AS\',if((`bdclick2`.`bdterceros`.`tipo` like \'*Menor sin identificaci*\'),\'MS\',if((`bdclick2`.`bdterceros`.`tipo` like \'*nico de identificaci*\'),\'NU\',\'\')))))))) AS `tipoIdentidad`,`bdclick2`.`bdterceros`.`tipo` AS `tipoIdentidadDesc`,if((`bdclick2`.`bdepsprecargados`.`codigoProteccionSocial` = \'000001\'),\'\',`bdclick2`.`bdepsprecargados`.`codigoProteccionSocial`) AS `codigoEntidadAdministradora`,if((`bdclick2`.`bdterceros`.`regimen` = \'Contributivo\'),\'1\',if((`bdclick2`.`bdterceros`.`regimen` = \'Subsidiado\'),\'2\',if((`bdclick2`.`bdterceros`.`regimen` = \'Vinculado\'),\'3\',if((`bdclick2`.`bdterceros`.`regimen` = \'Particular\'),\'4\',if((`bdclick2`.`bdterceros`.`regimen` = \'Otro\'),\'5\',\'\'))))) AS `TipoUsuario`,`bdclick2`.`bdterceros`.`regimen` AS `tipoUsuarioDesc`,cast(((cast(now() as date) - `bdclick2`.`bdterceros`.`nacimiento`) / 365) as signed) AS `Edad`,if(((year(cast(now() as date)) - year(`bdclick2`.`bdterceros`.`nacimiento`)) = 0),if(((month(cast(now() as date)) - month(`bdclick2`.`bdterceros`.`nacimiento`)) = 0),\'3\',\'2\'),\'1\') AS `unidadMedidaEdad`,if((`bdclick2`.`bdterceros`.`sexo` = \'Masculino\'),\'M\',\'F\') AS `sexo`,if((`bdclick2`.`bdterceros`.`zona` = \'Urbana\'),\'U\',\'R\') AS `zona`,`bdclick2`.`bdterceros`.`zona` AS `zonaDesc`,`bdclick2`.`bdmaestra`.`codPrestadorServicio` AS `codPrestadorServicio`,`bdclick2`.`bdmaestra`.`d1` AS `razonSocial`,`bdclick2`.`bdmaestra`.`tipoIdPrestadorServicio` AS `tipoPrestadorServicio`,`bdclick2`.`bdmaestra`.`d2` AS `IdPrestadorServicio`,if((`bdclick2`.`bdepsprecargados`.`codigoProteccionSocial` = \'000001\'),\'\',`bdclick2`.`bdepsprecargados`.`nombre`) AS `nombreEntidadAdministradora`,`ordenof`.`poliza` AS `nroPoliza`,`ordenof`.`comision` AS `valorComision`,`ordenof`.`descuento` AS `valorDescuento`,`bdclick2`.`bdepsprecargados`.`contrato` AS `numeroContrato`,`ordenof`.`tipo` AS `tipoOrden`,if((`ordenof`.`concepto` = \'Consultas\'),\'01\',if((`ordenof`.`concepto` like \'Procedimientos de diagn*\'),\'02\',if((`ordenof`.`concepto` like \'*uticos no quir*\'),\'03\',if((`ordenof`.`concepto` like \'Procedimientos terap*\'),\'04\',if((`ordenof`.`concepto` like \'Procedimientos de promoci*\'),\'05\',if((`ordenof`.`concepto` = \'Estancias\'),\'06\',if((`ordenof`.`concepto` = \'Honorarios\'),\'07\',if((`ordenof`.`concepto` = \'Derechos de sala\'),\'08\',if((`ordenof`.`concepto` = \'Materiales e insumos\'),\'09\',if((`ordenof`.`concepto` = \'Banco de sangre\'),\'10\',if((`ordenof`.`concepto` like \'*tesis y*\'),\'11\',if((`ordenof`.`concepto` = \'Medicamentos POS\'),\'12\',if((`ordenof`.`concepto` = \'Medicamentos no POS\'),\'13\',if((`ordenof`.`concepto` = \'Traslado de pacientes\'),\'14\',\'\')))))))))))))) AS `codigoConcepto`,`ordenof`.`concepto` AS `conceptoDesc`,if((`ordenof`.`codigoConsulta` = \'Consulta de Medicina General electiva\'),\'890201\',if((`ordenof`.`codigoConsulta` = \'Consulta de Medicina Especializada electiva\'),\'890202\',if((`ordenof`.`codigoConsulta` = \'Consulta de Medicina General de control\'),\'890301\',if((`ordenof`.`codigoConsulta` = \'Consulta de Medicina Especializada de control\'),\'890302\',if((`ordenof`.`codigoConsulta` = \'Consulta odontologica especializada de control\'),\'890304\',if((`ordenof`.`codigoConsulta` = \'Consulta odontologica general de control\'),\'890303\',if((`ordenof`.`codigoConsulta` = \'Consulta de odontologia general\'),\'890703\',if((`ordenof`.`codigoConsulta` = \'Consulta de odontologia especializada\'),\'890704\',\'\')))))))) AS `codConsulta`,`ordenof`.`codigoConsulta` AS `codigoConsultaDesc`,if((`ordenof`.`tipo` = \'procedimiento\'),if((`ordenof`.`finalidad` like \'Diagn*\'),\'1\',if((`ordenof`.`finalidad` like \'Terap*\'),\'2\',if((`ordenof`.`finalidad` like \'Protecci*\'),\'3\',if((`ordenof`.`finalidad` like \'*n temprana de enfermedad general\'),\'4\',if((`ordenof`.`finalidad` like \'*n temprana de enfermedad profesional\'),\'5\',\'\'))))),if((`ordenof`.`finalidad` like \'*n del parto (puerperio)\'),\'01\',if((`ordenof`.`finalidad` like \'*n del reci*\'),\'02\',if((`ordenof`.`finalidad` like \'*n en planificaci*\'),\'03\',if((`ordenof`.`finalidad` like \'No aplica\'),\'10\',if((`ordenof`.`finalidad` like \'Detecci*n de alteraci*n del*\'),\'05\',if((`ordenof`.`finalidad` like \'Detecci*n de alteraciones del embarazo\'),\'06\',if((`ordenof`.`finalidad` like \'Detecci*n de alteraciones del adulto\'),\'07\',if((`ordenof`.`finalidad` like \'Detecci*n de alteraciones de agudeza visual\'),\'08\',if((`ordenof`.`finalidad` like \'Detecci*n de enfermedad profesional\'),\'09\',if((`ordenof`.`finalidad` like \'*n de alteraciones de*\'),\'04\',\'\'))))))))))) AS `finalidadd`,`ordenof`.`finalidad` AS `finalidadDesc`,if((`ordenof`.`causa` = \'Accidente de trabajo\'),\'01\',if((`ordenof`.`causa` like \'Accidente de tr*nsito\'),\'02\',if((`ordenof`.`causa` like \'Accidente r*bico\'),\'03\',if((`ordenof`.`causa` like \'Accidente of*dico\'),\'04\',if((`ordenof`.`causa` = \'Otro tipo de accidente\'),\'05\',if((`ordenof`.`causa` like \'Evento catastr*fico\'),\'06\',if((`ordenof`.`causa` like \'Lesi*n por agresi*n\'),\'07\',if((`ordenof`.`causa` like \'Lesi*n auto infligida\'),\'08\',if((`ordenof`.`causa` like \'Sospecha de maltrato f*sico\'),\'09\',if((`ordenof`.`causa` = \'Sospecha de abuso sexual\'),\'10\',if((`ordenof`.`causa` = \'Sospecha de violencia sexual\'),\'11\',if((`ordenof`.`causa` = \'Sospecha de maltrato emocional\'),\'12\',if((`ordenof`.`causa` = \'Enfermedad general\'),\'13\',if((`ordenof`.`causa` = \'Enfermedad profesional\'),\'14\',\'15\')))))))))))))) AS `causaExterna`,`ordenof`.`causa` AS `causaExternaDesc`,`ordenof`.`cuota` AS `valorCuotaModeradora`,if((`ordenof`.`ambito` = \'Ambulatorio\'),\'1\',if((`ordenof`.`ambito` = \'Hospitalario\'),\'2\',\'3\')) AS `ambitoProcedimiento`,`ordenof`.`ambito` AS `ambitoProcedimientoDesc`,if((`ordenof`.`personal` like \'M*dico (A) especialista\'),\'1\',if((`ordenof`.`personal` like \'M*dico (a) general\'),\'2\',if((`ordenof`.`personal` = \'Enfermera (o)\'),\'3\',if((`ordenof`.`personal` like \'Auxiliar de enfermer*a\'),\'4\',if((`ordenof`.`personal` = \'Otro\'),\'5\',\'\'))))) AS `personalAtiende`,`ordenof`.`personal` AS `personalDesc`,`ordenof`.`Estado` AS `Estado`,`bdclick2`.`bdregiones`.`codigoDepartamento` AS `codigoDepartamento`,`bdclick2`.`bdregiones`.`codigoMunicipio` AS `codigoMunicipio`,`ordenof`.`estado2` AS `estado2`,`ordenof`.`orden` AS `facturaNumero` from (`bdclick2`.`bdmaestra` join ((`bdclick2`.`bdproductos` join `bdclick2`.`bdordenserviciooftalmologia` `ordenof` on((`bdclick2`.`bdproductos`.`Codigo` = `ordenof`.`acobrar`))) join ((`bdclick2`.`bdterceros` join `bdclick2`.`bdepsprecargados` on((`bdclick2`.`bdterceros`.`eps` = `bdclick2`.`bdepsprecargados`.`Id`))) join `bdclick2`.`bdregiones` on(((`bdclick2`.`bdterceros`.`ciudad` = `bdclick2`.`bdregiones`.`nombreMunicipio`) and (`bdclick2`.`bdterceros`.`departamento` = `bdclick2`.`bdregiones`.`nombreDepartamento`)))) on((`ordenof`.`paciente` = `bdclick2`.`bdterceros`.`id`)))))
mariadb-version=100135
