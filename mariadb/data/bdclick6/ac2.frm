TYPE=VIEW
query=(select `bdclick6`.`bdclickppal`.`codPrestadorServicio` AS `codPrestadorServicio`,`bdclick6`.`bdclickppal`.`tipoIdentidad` AS `tipoIdentidad`,`bdclick6`.`bdclickppal`.`Id` AS `Id`,`bdclick6`.`bdclickppal`.`fecha` AS `fecha`,`bdclick6`.`bdclickppal`.`autorizacion` AS `autorizacion`,`bdclick6`.`bdclickppal`.`codConsulta` AS `codConsulta`,`bdclick6`.`bdclickppal`.`finalidadd` AS `finalidadd`,`bdclick6`.`bdclickppal`.`causaExterna` AS `causaExterna`,`bdclick6`.`bdclickppal`.`cie` AS `cie`,`bdclick6`.`bdclickppal`.`codDiagnosticoReacionado1` AS `codDiagnosticoReacionado1`,`bdclick6`.`bdclickppal`.`codDiagnosticoReacionado2` AS `codDiagnosticoReacionado2`,`bdclick6`.`bdclickppal`.`codDiagnosticoReacionado3` AS `codDiagnosticoReacionado3`,`bdclick6`.`bdclickppal`.`tipoDiagnosticoPrincipal` AS `tipoDiagnosticoPrincipal`,(`bdclick6`.`bdclickppal`.`valor` * `bdclick6`.`bdclickppal`.`cantidadRealizada`) AS `valor2`,`bdclick6`.`bdclickppal`.`valorCuotaModeradora` AS `valorCuotaModeradora`,(`bdclick6`.`bdclickppal`.`valor` * `bdclick6`.`bdclickppal`.`cantidad`) AS `valorNeto`,`bdclick6`.`bdclickppal`.`orden` AS `orden`,`bdclick6`.`bdclickppal`.`estado2` AS `estado2`,`bdclick6`.`bdclickppal`.`facturaNumero` AS `facturaNumero` from `bdclick6`.`bdclickppal` where (`bdclick6`.`bdclickppal`.`tipoOrden` = \'consulta\'))
md5=0bad56ec2989754c669598fba7ff0c9f
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:32
create-version=2
source=(select `bdclickppal`.`codPrestadorServicio` AS `codPrestadorServicio`,`bdclickppal`.`tipoIdentidad` AS `tipoIdentidad`,`bdclickppal`.`Id` AS `Id`,`bdclickppal`.`fecha` AS `fecha`,`bdclickppal`.`autorizacion` AS `autorizacion`,`bdclickppal`.`codConsulta` AS `codConsulta`,`bdclickppal`.`finalidadd` AS `finalidadd`,`bdclickppal`.`causaExterna` AS `causaExterna`,`bdclickppal`.`cie` AS `cie`,`bdclickppal`.`codDiagnosticoReacionado1` AS `codDiagnosticoReacionado1`,`bdclickppal`.`codDiagnosticoReacionado2` AS `codDiagnosticoReacionado2`,`bdclickppal`.`codDiagnosticoReacionado3` AS `codDiagnosticoReacionado3`,`bdclickppal`.`tipoDiagnosticoPrincipal` AS `tipoDiagnosticoPrincipal`,(`bdclickppal`.`valor` * `bdclickppal`.`cantidadRealizada`) AS `valor2`,`bdclickppal`.`valorCuotaModeradora` AS `valorCuotaModeradora`,(`bdclickppal`.`valor` * `bdclickppal`.`cantidad`) AS `valorNeto`,`bdclickppal`.`orden` AS `orden`,`bdclickppal`.`estado2` AS `estado2`,`bdclickppal`.`facturaNumero` AS `facturaNumero` from `bdclickppal` where (`bdclickppal`.`tipoOrden` = \'consulta\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick6`.`bdclickppal`.`codPrestadorServicio` AS `codPrestadorServicio`,`bdclick6`.`bdclickppal`.`tipoIdentidad` AS `tipoIdentidad`,`bdclick6`.`bdclickppal`.`Id` AS `Id`,`bdclick6`.`bdclickppal`.`fecha` AS `fecha`,`bdclick6`.`bdclickppal`.`autorizacion` AS `autorizacion`,`bdclick6`.`bdclickppal`.`codConsulta` AS `codConsulta`,`bdclick6`.`bdclickppal`.`finalidadd` AS `finalidadd`,`bdclick6`.`bdclickppal`.`causaExterna` AS `causaExterna`,`bdclick6`.`bdclickppal`.`cie` AS `cie`,`bdclick6`.`bdclickppal`.`codDiagnosticoReacionado1` AS `codDiagnosticoReacionado1`,`bdclick6`.`bdclickppal`.`codDiagnosticoReacionado2` AS `codDiagnosticoReacionado2`,`bdclick6`.`bdclickppal`.`codDiagnosticoReacionado3` AS `codDiagnosticoReacionado3`,`bdclick6`.`bdclickppal`.`tipoDiagnosticoPrincipal` AS `tipoDiagnosticoPrincipal`,(`bdclick6`.`bdclickppal`.`valor` * `bdclick6`.`bdclickppal`.`cantidadRealizada`) AS `valor2`,`bdclick6`.`bdclickppal`.`valorCuotaModeradora` AS `valorCuotaModeradora`,(`bdclick6`.`bdclickppal`.`valor` * `bdclick6`.`bdclickppal`.`cantidad`) AS `valorNeto`,`bdclick6`.`bdclickppal`.`orden` AS `orden`,`bdclick6`.`bdclickppal`.`estado2` AS `estado2`,`bdclick6`.`bdclickppal`.`facturaNumero` AS `facturaNumero` from `bdclick6`.`bdclickppal` where (`bdclick6`.`bdclickppal`.`tipoOrden` = \'consulta\'))
mariadb-version=100135
