TYPE=VIEW
query=(select `bdclick`.`ripslaboratorio`.`codPrestadorServicio` AS `codPrestadorServicio`,`bdclick`.`ripslaboratorio`.`tipoIdentidad` AS `tipoIdentidad`,`bdclick`.`ripslaboratorio`.`Id` AS `Id`,`bdclick`.`ripslaboratorio`.`fecha` AS `fecha`,`bdclick`.`ripslaboratorio`.`autorizacion` AS `autorizacion`,`bdclick`.`ripslaboratorio`.`codConsulta` AS `codConsulta`,`bdclick`.`ripslaboratorio`.`finalidadd` AS `finalidadd`,`bdclick`.`ripslaboratorio`.`causaExterna` AS `causaExterna`,`bdclick`.`ripslaboratorio`.`cie` AS `cie`,`bdclick`.`ripslaboratorio`.`codDiagnosticoReacionado1` AS `codDiagnosticoReacionado1`,`bdclick`.`ripslaboratorio`.`codDiagnosticoReacionado2` AS `codDiagnosticoReacionado2`,`bdclick`.`ripslaboratorio`.`codDiagnosticoReacionado3` AS `codDiagnosticoReacionado3`,`bdclick`.`ripslaboratorio`.`tipoDiagnosticoPrincipal` AS `tipoDiagnosticoPrincipal`,(`bdclick`.`ripslaboratorio`.`valor` * `bdclick`.`ripslaboratorio`.`cantidadRealizada`) AS `valor2`,`bdclick`.`ripslaboratorio`.`valorCuotaModeradora` AS `valorCuotaModeradora`,(`bdclick`.`ripslaboratorio`.`valor` * `bdclick`.`ripslaboratorio`.`cantidad`) AS `valorNeto`,`bdclick`.`ripslaboratorio`.`orden` AS `orden`,`bdclick`.`ripslaboratorio`.`estado2` AS `estado2`,`bdclick`.`ripslaboratorio`.`facturaNumero` AS `facturaNumero` from `bdclick`.`ripslaboratorio` where (`bdclick`.`ripslaboratorio`.`tipoOrden` = \'consulta\'))
md5=d144196aff2f0668689539f50206fa6d
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:21
create-version=2
source=(select `ripslaboratorio`.`codPrestadorServicio` AS `codPrestadorServicio`,`ripslaboratorio`.`tipoIdentidad` AS `tipoIdentidad`,`ripslaboratorio`.`Id` AS `Id`,`ripslaboratorio`.`fecha` AS `fecha`,`ripslaboratorio`.`autorizacion` AS `autorizacion`,`ripslaboratorio`.`codConsulta` AS `codConsulta`,`ripslaboratorio`.`finalidadd` AS `finalidadd`,`ripslaboratorio`.`causaExterna` AS `causaExterna`,`ripslaboratorio`.`cie` AS `cie`,`ripslaboratorio`.`codDiagnosticoReacionado1` AS `codDiagnosticoReacionado1`,`ripslaboratorio`.`codDiagnosticoReacionado2` AS `codDiagnosticoReacionado2`,`ripslaboratorio`.`codDiagnosticoReacionado3` AS `codDiagnosticoReacionado3`,`ripslaboratorio`.`tipoDiagnosticoPrincipal` AS `tipoDiagnosticoPrincipal`,(`ripslaboratorio`.`valor` * `ripslaboratorio`.`cantidadRealizada`) AS `valor2`,`ripslaboratorio`.`valorCuotaModeradora` AS `valorCuotaModeradora`,(`ripslaboratorio`.`valor` * `ripslaboratorio`.`cantidad`) AS `valorNeto`,`ripslaboratorio`.`orden` AS `orden`,`ripslaboratorio`.`estado2` AS `estado2`,`ripslaboratorio`.`facturaNumero` AS `facturaNumero` from `ripslaboratorio` where (`ripslaboratorio`.`tipoOrden` = \'consulta\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick`.`ripslaboratorio`.`codPrestadorServicio` AS `codPrestadorServicio`,`bdclick`.`ripslaboratorio`.`tipoIdentidad` AS `tipoIdentidad`,`bdclick`.`ripslaboratorio`.`Id` AS `Id`,`bdclick`.`ripslaboratorio`.`fecha` AS `fecha`,`bdclick`.`ripslaboratorio`.`autorizacion` AS `autorizacion`,`bdclick`.`ripslaboratorio`.`codConsulta` AS `codConsulta`,`bdclick`.`ripslaboratorio`.`finalidadd` AS `finalidadd`,`bdclick`.`ripslaboratorio`.`causaExterna` AS `causaExterna`,`bdclick`.`ripslaboratorio`.`cie` AS `cie`,`bdclick`.`ripslaboratorio`.`codDiagnosticoReacionado1` AS `codDiagnosticoReacionado1`,`bdclick`.`ripslaboratorio`.`codDiagnosticoReacionado2` AS `codDiagnosticoReacionado2`,`bdclick`.`ripslaboratorio`.`codDiagnosticoReacionado3` AS `codDiagnosticoReacionado3`,`bdclick`.`ripslaboratorio`.`tipoDiagnosticoPrincipal` AS `tipoDiagnosticoPrincipal`,(`bdclick`.`ripslaboratorio`.`valor` * `bdclick`.`ripslaboratorio`.`cantidadRealizada`) AS `valor2`,`bdclick`.`ripslaboratorio`.`valorCuotaModeradora` AS `valorCuotaModeradora`,(`bdclick`.`ripslaboratorio`.`valor` * `bdclick`.`ripslaboratorio`.`cantidad`) AS `valorNeto`,`bdclick`.`ripslaboratorio`.`orden` AS `orden`,`bdclick`.`ripslaboratorio`.`estado2` AS `estado2`,`bdclick`.`ripslaboratorio`.`facturaNumero` AS `facturaNumero` from `bdclick`.`ripslaboratorio` where (`bdclick`.`ripslaboratorio`.`tipoOrden` = \'consulta\'))
mariadb-version=100135