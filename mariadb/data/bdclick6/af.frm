TYPE=VIEW
query=select `bdclick6`.`bdclickppal`.`codPrestadorServicio` AS `codPrestadorServicio`,`bdclick6`.`bdclickppal`.`razonSocial` AS `razonSocial`,`bdclick6`.`bdclickppal`.`tipoPrestadorServicio` AS `tipoPrestadorServicio`,`bdclick6`.`bdclickppal`.`IdPrestadorServicio` AS `IdPrestadorServicio`,`bdclick6`.`bdclickppal`.`codigoEntidadAdministradora` AS `codigoEntidadAdministradora`,`bdclick6`.`bdclickppal`.`nombreEntidadAdministradora` AS `nombreEntidadAdministradora`,`bdclick6`.`bdclickppal`.`numeroContrato` AS `numeroContrato`,`bdclick6`.`bdclickppal`.`nroPoliza` AS `nroPoliza`,`bdclick6`.`bdclickppal`.`copago` AS `copago`,`bdclick6`.`bdclickppal`.`valorComision` AS `valorComision`,`bdclick6`.`bdclickppal`.`valorDescuento` AS `valorDescuento`,((`bdclick6`.`bdclickppal`.`valor` * `bdclick6`.`bdclickppal`.`cantidadRealizada`) - `bdclick6`.`bdclickppal`.`copago`) AS `valor2`,`bdclick6`.`bdclickppal`.`facturaNumero` AS `orden`,`bdclick6`.`bdclickppal`.`estado2` AS `estado2`,`bdclick6`.`bdclickppal`.`fecha` AS `fecha` from `bdclick6`.`bdclickppal`
md5=7d97ce3a29337c07ff65a87ef475eb4d
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:32
create-version=2
source=select `bdclickppal`.`codPrestadorServicio` AS `codPrestadorServicio`,`bdclickppal`.`razonSocial` AS `razonSocial`,`bdclickppal`.`tipoPrestadorServicio` AS `tipoPrestadorServicio`,`bdclickppal`.`IdPrestadorServicio` AS `IdPrestadorServicio`,`bdclickppal`.`codigoEntidadAdministradora` AS `codigoEntidadAdministradora`,`bdclickppal`.`nombreEntidadAdministradora` AS `nombreEntidadAdministradora`,`bdclickppal`.`numeroContrato` AS `numeroContrato`,`bdclickppal`.`nroPoliza` AS `nroPoliza`,`bdclickppal`.`copago` AS `copago`,`bdclickppal`.`valorComision` AS `valorComision`,`bdclickppal`.`valorDescuento` AS `valorDescuento`,((`bdclickppal`.`valor` * `bdclickppal`.`cantidadRealizada`) - `bdclickppal`.`copago`) AS `valor2`,`bdclickppal`.`facturaNumero` AS `orden`,`bdclickppal`.`estado2` AS `estado2`,`bdclickppal`.`fecha` AS `fecha` from `bdclickppal`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdclickppal`.`codPrestadorServicio` AS `codPrestadorServicio`,`bdclick6`.`bdclickppal`.`razonSocial` AS `razonSocial`,`bdclick6`.`bdclickppal`.`tipoPrestadorServicio` AS `tipoPrestadorServicio`,`bdclick6`.`bdclickppal`.`IdPrestadorServicio` AS `IdPrestadorServicio`,`bdclick6`.`bdclickppal`.`codigoEntidadAdministradora` AS `codigoEntidadAdministradora`,`bdclick6`.`bdclickppal`.`nombreEntidadAdministradora` AS `nombreEntidadAdministradora`,`bdclick6`.`bdclickppal`.`numeroContrato` AS `numeroContrato`,`bdclick6`.`bdclickppal`.`nroPoliza` AS `nroPoliza`,`bdclick6`.`bdclickppal`.`copago` AS `copago`,`bdclick6`.`bdclickppal`.`valorComision` AS `valorComision`,`bdclick6`.`bdclickppal`.`valorDescuento` AS `valorDescuento`,((`bdclick6`.`bdclickppal`.`valor` * `bdclick6`.`bdclickppal`.`cantidadRealizada`) - `bdclick6`.`bdclickppal`.`copago`) AS `valor2`,`bdclick6`.`bdclickppal`.`facturaNumero` AS `orden`,`bdclick6`.`bdclickppal`.`estado2` AS `estado2`,`bdclick6`.`bdclickppal`.`fecha` AS `fecha` from `bdclick6`.`bdclickppal`
mariadb-version=100135
