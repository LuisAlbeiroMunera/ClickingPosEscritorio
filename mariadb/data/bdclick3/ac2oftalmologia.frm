TYPE=VIEW
query=(select `bdclick3`.`ripsoftalmologia`.`codPrestadorServicio` AS `codPrestadorServicio`,`bdclick3`.`ripsoftalmologia`.`tipoIdentidad` AS `tipoIdentidad`,`bdclick3`.`ripsoftalmologia`.`Id` AS `Id`,`bdclick3`.`ripsoftalmologia`.`fecha` AS `fecha`,`bdclick3`.`ripsoftalmologia`.`autorizacion` AS `autorizacion`,`bdclick3`.`ripsoftalmologia`.`codConsulta` AS `codConsulta`,`bdclick3`.`ripsoftalmologia`.`finalidadd` AS `finalidadd`,`bdclick3`.`ripsoftalmologia`.`causaExterna` AS `causaExterna`,`bdclick3`.`ripsoftalmologia`.`cie` AS `cie`,`bdclick3`.`ripsoftalmologia`.`codDiagnosticoReacionado1` AS `codDiagnosticoReacionado1`,`bdclick3`.`ripsoftalmologia`.`codDiagnosticoReacionado2` AS `codDiagnosticoReacionado2`,`bdclick3`.`ripsoftalmologia`.`codDiagnosticoReacionado3` AS `codDiagnosticoReacionado3`,`bdclick3`.`ripsoftalmologia`.`tipoDiagnosticoPrincipal` AS `tipoDiagnosticoPrincipal`,(`bdclick3`.`ripsoftalmologia`.`valor` * `bdclick3`.`ripsoftalmologia`.`cantidadRealizada`) AS `valor2`,`bdclick3`.`ripsoftalmologia`.`valorCuotaModeradora` AS `valorCuotaModeradora`,(`bdclick3`.`ripsoftalmologia`.`valor` * `bdclick3`.`ripsoftalmologia`.`cantidad`) AS `valorNeto`,`bdclick3`.`ripsoftalmologia`.`orden` AS `orden`,`bdclick3`.`ripsoftalmologia`.`estado2` AS `estado2`,`bdclick3`.`ripsoftalmologia`.`facturaNumero` AS `facturaNumero` from `bdclick3`.`ripsoftalmologia` where (`bdclick3`.`ripsoftalmologia`.`tipoOrden` = \'consulta\'))
md5=6d19bb428cebee79522dc31b3ef6d75f
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:47
create-version=2
source=(select `ripsoftalmologia`.`codPrestadorServicio` AS `codPrestadorServicio`,`ripsoftalmologia`.`tipoIdentidad` AS `tipoIdentidad`,`ripsoftalmologia`.`Id` AS `Id`,`ripsoftalmologia`.`fecha` AS `fecha`,`ripsoftalmologia`.`autorizacion` AS `autorizacion`,`ripsoftalmologia`.`codConsulta` AS `codConsulta`,`ripsoftalmologia`.`finalidadd` AS `finalidadd`,`ripsoftalmologia`.`causaExterna` AS `causaExterna`,`ripsoftalmologia`.`cie` AS `cie`,`ripsoftalmologia`.`codDiagnosticoReacionado1` AS `codDiagnosticoReacionado1`,`ripsoftalmologia`.`codDiagnosticoReacionado2` AS `codDiagnosticoReacionado2`,`ripsoftalmologia`.`codDiagnosticoReacionado3` AS `codDiagnosticoReacionado3`,`ripsoftalmologia`.`tipoDiagnosticoPrincipal` AS `tipoDiagnosticoPrincipal`,(`ripsoftalmologia`.`valor` * `ripsoftalmologia`.`cantidadRealizada`) AS `valor2`,`ripsoftalmologia`.`valorCuotaModeradora` AS `valorCuotaModeradora`,(`ripsoftalmologia`.`valor` * `ripsoftalmologia`.`cantidad`) AS `valorNeto`,`ripsoftalmologia`.`orden` AS `orden`,`ripsoftalmologia`.`estado2` AS `estado2`,`ripsoftalmologia`.`facturaNumero` AS `facturaNumero` from `ripsoftalmologia` where (`ripsoftalmologia`.`tipoOrden` = \'consulta\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick3`.`ripsoftalmologia`.`codPrestadorServicio` AS `codPrestadorServicio`,`bdclick3`.`ripsoftalmologia`.`tipoIdentidad` AS `tipoIdentidad`,`bdclick3`.`ripsoftalmologia`.`Id` AS `Id`,`bdclick3`.`ripsoftalmologia`.`fecha` AS `fecha`,`bdclick3`.`ripsoftalmologia`.`autorizacion` AS `autorizacion`,`bdclick3`.`ripsoftalmologia`.`codConsulta` AS `codConsulta`,`bdclick3`.`ripsoftalmologia`.`finalidadd` AS `finalidadd`,`bdclick3`.`ripsoftalmologia`.`causaExterna` AS `causaExterna`,`bdclick3`.`ripsoftalmologia`.`cie` AS `cie`,`bdclick3`.`ripsoftalmologia`.`codDiagnosticoReacionado1` AS `codDiagnosticoReacionado1`,`bdclick3`.`ripsoftalmologia`.`codDiagnosticoReacionado2` AS `codDiagnosticoReacionado2`,`bdclick3`.`ripsoftalmologia`.`codDiagnosticoReacionado3` AS `codDiagnosticoReacionado3`,`bdclick3`.`ripsoftalmologia`.`tipoDiagnosticoPrincipal` AS `tipoDiagnosticoPrincipal`,(`bdclick3`.`ripsoftalmologia`.`valor` * `bdclick3`.`ripsoftalmologia`.`cantidadRealizada`) AS `valor2`,`bdclick3`.`ripsoftalmologia`.`valorCuotaModeradora` AS `valorCuotaModeradora`,(`bdclick3`.`ripsoftalmologia`.`valor` * `bdclick3`.`ripsoftalmologia`.`cantidad`) AS `valorNeto`,`bdclick3`.`ripsoftalmologia`.`orden` AS `orden`,`bdclick3`.`ripsoftalmologia`.`estado2` AS `estado2`,`bdclick3`.`ripsoftalmologia`.`facturaNumero` AS `facturaNumero` from `bdclick3`.`ripsoftalmologia` where (`bdclick3`.`ripsoftalmologia`.`tipoOrden` = \'consulta\'))
mariadb-version=100135