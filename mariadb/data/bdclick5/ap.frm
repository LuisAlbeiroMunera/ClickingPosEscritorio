TYPE=VIEW
query=select `bdclick5`.`bdclickppal`.`codPrestadorServicio` AS `codPrestadorServicio`,`bdclick5`.`bdclickppal`.`tipoIdentidad` AS `tipoIdentidad`,`bdclick5`.`bdclickppal`.`Id` AS `Id`,`bdclick5`.`bdclickppal`.`fecha` AS `fecha`,`bdclick5`.`bdclickppal`.`autorizacion` AS `autorizacion`,`bdclick5`.`bdclickppal`.`codigoTarifa` AS `codigoTarifa`,`bdclick5`.`bdclickppal`.`ambitoProcedimiento` AS `ambitoProcedimiento`,`bdclick5`.`bdclickppal`.`finalidadd` AS `finalidadd`,`bdclick5`.`bdclickppal`.`personalAtiende` AS `personalAtiende`,`bdclick5`.`bdclickppal`.`tipoDiagnosticoPrincipal` AS `tipoDiagnosticoPrincipal`,`bdclick5`.`bdclickppal`.`DiagnosticoRelacionado` AS `DiagnosticoRelacionado`,`bdclick5`.`bdclickppal`.`complicaciones` AS `complicaciones`,`bdclick5`.`bdclickppal`.`actoQuirurgico` AS `actoQuirurgico`,(`bdclick5`.`bdclickppal`.`valor` * `bdclick5`.`bdclickppal`.`cantidadRealizada`) AS `valor2`,`bdclick5`.`bdclickppal`.`facturaNumero` AS `orden`,`bdclick5`.`bdclickppal`.`estado2` AS `estado2` from `bdclick5`.`bdclickppal` where (`bdclick5`.`bdclickppal`.`tipoOrden` = \'procedimiento\')
md5=642f4b106c109634739ec4f706e960ec
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:44
create-version=2
source=select `bdclickppal`.`codPrestadorServicio` AS `codPrestadorServicio`,`bdclickppal`.`tipoIdentidad` AS `tipoIdentidad`,`bdclickppal`.`Id` AS `Id`,`bdclickppal`.`fecha` AS `fecha`,`bdclickppal`.`autorizacion` AS `autorizacion`,`bdclickppal`.`codigoTarifa` AS `codigoTarifa`,`bdclickppal`.`ambitoProcedimiento` AS `ambitoProcedimiento`,`bdclickppal`.`finalidadd` AS `finalidadd`,`bdclickppal`.`personalAtiende` AS `personalAtiende`,`bdclickppal`.`tipoDiagnosticoPrincipal` AS `tipoDiagnosticoPrincipal`,`bdclickppal`.`DiagnosticoRelacionado` AS `DiagnosticoRelacionado`,`bdclickppal`.`complicaciones` AS `complicaciones`,`bdclickppal`.`actoQuirurgico` AS `actoQuirurgico`,(`bdclickppal`.`valor` * `bdclickppal`.`cantidadRealizada`) AS `valor2`,`bdclickppal`.`facturaNumero` AS `orden`,`bdclickppal`.`estado2` AS `estado2` from `bdclickppal` where (`bdclickppal`.`tipoOrden` = \'procedimiento\')
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdclickppal`.`codPrestadorServicio` AS `codPrestadorServicio`,`bdclick5`.`bdclickppal`.`tipoIdentidad` AS `tipoIdentidad`,`bdclick5`.`bdclickppal`.`Id` AS `Id`,`bdclick5`.`bdclickppal`.`fecha` AS `fecha`,`bdclick5`.`bdclickppal`.`autorizacion` AS `autorizacion`,`bdclick5`.`bdclickppal`.`codigoTarifa` AS `codigoTarifa`,`bdclick5`.`bdclickppal`.`ambitoProcedimiento` AS `ambitoProcedimiento`,`bdclick5`.`bdclickppal`.`finalidadd` AS `finalidadd`,`bdclick5`.`bdclickppal`.`personalAtiende` AS `personalAtiende`,`bdclick5`.`bdclickppal`.`tipoDiagnosticoPrincipal` AS `tipoDiagnosticoPrincipal`,`bdclick5`.`bdclickppal`.`DiagnosticoRelacionado` AS `DiagnosticoRelacionado`,`bdclick5`.`bdclickppal`.`complicaciones` AS `complicaciones`,`bdclick5`.`bdclickppal`.`actoQuirurgico` AS `actoQuirurgico`,(`bdclick5`.`bdclickppal`.`valor` * `bdclick5`.`bdclickppal`.`cantidadRealizada`) AS `valor2`,`bdclick5`.`bdclickppal`.`facturaNumero` AS `orden`,`bdclick5`.`bdclickppal`.`estado2` AS `estado2` from `bdclick5`.`bdclickppal` where (`bdclick5`.`bdclickppal`.`tipoOrden` = \'procedimiento\')
mariadb-version=100135