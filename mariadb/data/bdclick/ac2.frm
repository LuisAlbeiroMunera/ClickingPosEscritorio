TYPE=VIEW
query=(select `bdclick`.`bdclickppal`.`codPrestadorServicio` AS `codPrestadorServicio`,`bdclick`.`bdclickppal`.`tipoIdentidad` AS `tipoIdentidad`,`bdclick`.`bdclickppal`.`Id` AS `Id`,`bdclick`.`bdclickppal`.`fecha` AS `fecha`,`bdclick`.`bdclickppal`.`autorizacion` AS `autorizacion`,`bdclick`.`bdclickppal`.`codConsulta` AS `codConsulta`,`bdclick`.`bdclickppal`.`finalidadd` AS `finalidadd`,`bdclick`.`bdclickppal`.`causaExterna` AS `causaExterna`,`bdclick`.`bdclickppal`.`cie` AS `cie`,`bdclick`.`bdclickppal`.`codDiagnosticoReacionado1` AS `codDiagnosticoReacionado1`,`bdclick`.`bdclickppal`.`codDiagnosticoReacionado2` AS `codDiagnosticoReacionado2`,`bdclick`.`bdclickppal`.`codDiagnosticoReacionado3` AS `codDiagnosticoReacionado3`,`bdclick`.`bdclickppal`.`tipoDiagnosticoPrincipal` AS `tipoDiagnosticoPrincipal`,(`bdclick`.`bdclickppal`.`valor` * `bdclick`.`bdclickppal`.`cantidadRealizada`) AS `valor2`,`bdclick`.`bdclickppal`.`valorCuotaModeradora` AS `valorCuotaModeradora`,(`bdclick`.`bdclickppal`.`valor` * `bdclick`.`bdclickppal`.`cantidad`) AS `valorNeto`,`bdclick`.`bdclickppal`.`orden` AS `orden`,`bdclick`.`bdclickppal`.`estado2` AS `estado2`,`bdclick`.`bdclickppal`.`facturaNumero` AS `facturaNumero` from `bdclick`.`bdclickppal` where (`bdclick`.`bdclickppal`.`tipoOrden` = \'consulta\'))
md5=496360982ca28f175a90db089b4d5bd3
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:21
create-version=2
source=(select `bdclickppal`.`codPrestadorServicio` AS `codPrestadorServicio`,`bdclickppal`.`tipoIdentidad` AS `tipoIdentidad`,`bdclickppal`.`Id` AS `Id`,`bdclickppal`.`fecha` AS `fecha`,`bdclickppal`.`autorizacion` AS `autorizacion`,`bdclickppal`.`codConsulta` AS `codConsulta`,`bdclickppal`.`finalidadd` AS `finalidadd`,`bdclickppal`.`causaExterna` AS `causaExterna`,`bdclickppal`.`cie` AS `cie`,`bdclickppal`.`codDiagnosticoReacionado1` AS `codDiagnosticoReacionado1`,`bdclickppal`.`codDiagnosticoReacionado2` AS `codDiagnosticoReacionado2`,`bdclickppal`.`codDiagnosticoReacionado3` AS `codDiagnosticoReacionado3`,`bdclickppal`.`tipoDiagnosticoPrincipal` AS `tipoDiagnosticoPrincipal`,(`bdclickppal`.`valor` * `bdclickppal`.`cantidadRealizada`) AS `valor2`,`bdclickppal`.`valorCuotaModeradora` AS `valorCuotaModeradora`,(`bdclickppal`.`valor` * `bdclickppal`.`cantidad`) AS `valorNeto`,`bdclickppal`.`orden` AS `orden`,`bdclickppal`.`estado2` AS `estado2`,`bdclickppal`.`facturaNumero` AS `facturaNumero` from `bdclickppal` where (`bdclickppal`.`tipoOrden` = \'consulta\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick`.`bdclickppal`.`codPrestadorServicio` AS `codPrestadorServicio`,`bdclick`.`bdclickppal`.`tipoIdentidad` AS `tipoIdentidad`,`bdclick`.`bdclickppal`.`Id` AS `Id`,`bdclick`.`bdclickppal`.`fecha` AS `fecha`,`bdclick`.`bdclickppal`.`autorizacion` AS `autorizacion`,`bdclick`.`bdclickppal`.`codConsulta` AS `codConsulta`,`bdclick`.`bdclickppal`.`finalidadd` AS `finalidadd`,`bdclick`.`bdclickppal`.`causaExterna` AS `causaExterna`,`bdclick`.`bdclickppal`.`cie` AS `cie`,`bdclick`.`bdclickppal`.`codDiagnosticoReacionado1` AS `codDiagnosticoReacionado1`,`bdclick`.`bdclickppal`.`codDiagnosticoReacionado2` AS `codDiagnosticoReacionado2`,`bdclick`.`bdclickppal`.`codDiagnosticoReacionado3` AS `codDiagnosticoReacionado3`,`bdclick`.`bdclickppal`.`tipoDiagnosticoPrincipal` AS `tipoDiagnosticoPrincipal`,(`bdclick`.`bdclickppal`.`valor` * `bdclick`.`bdclickppal`.`cantidadRealizada`) AS `valor2`,`bdclick`.`bdclickppal`.`valorCuotaModeradora` AS `valorCuotaModeradora`,(`bdclick`.`bdclickppal`.`valor` * `bdclick`.`bdclickppal`.`cantidad`) AS `valorNeto`,`bdclick`.`bdclickppal`.`orden` AS `orden`,`bdclick`.`bdclickppal`.`estado2` AS `estado2`,`bdclick`.`bdclickppal`.`facturaNumero` AS `facturaNumero` from `bdclick`.`bdclickppal` where (`bdclick`.`bdclickppal`.`tipoOrden` = \'consulta\'))
mariadb-version=100135
