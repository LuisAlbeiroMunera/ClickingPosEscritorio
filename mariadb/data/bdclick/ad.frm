TYPE=VIEW
query=select `bdclick`.`bdclickppal`.`codPrestadorServicio` AS `codPrestadorServicio`,`bdclick`.`bdclickppal`.`codigoConcepto` AS `codigoConcepto`,`bdclick`.`bdclickppal`.`cantidadRealizada` AS `cantidadRealizada`,`bdclick`.`bdclickppal`.`valor` AS `valor`,(`bdclick`.`bdclickppal`.`valor` * `bdclick`.`bdclickppal`.`cantidadRealizada`) AS `valorTotal`,`bdclick`.`bdclickppal`.`facturaNumero` AS `orden`,`bdclick`.`bdclickppal`.`estado2` AS `estado2` from `bdclick`.`bdclickppal`
md5=c9e527f7f8e7f3ca87b81c062ef45a4f
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:21
create-version=2
source=select `bdclickppal`.`codPrestadorServicio` AS `codPrestadorServicio`,`bdclickppal`.`codigoConcepto` AS `codigoConcepto`,`bdclickppal`.`cantidadRealizada` AS `cantidadRealizada`,`bdclickppal`.`valor` AS `valor`,(`bdclickppal`.`valor` * `bdclickppal`.`cantidadRealizada`) AS `valorTotal`,`bdclickppal`.`facturaNumero` AS `orden`,`bdclickppal`.`estado2` AS `estado2` from `bdclickppal`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdclickppal`.`codPrestadorServicio` AS `codPrestadorServicio`,`bdclick`.`bdclickppal`.`codigoConcepto` AS `codigoConcepto`,`bdclick`.`bdclickppal`.`cantidadRealizada` AS `cantidadRealizada`,`bdclick`.`bdclickppal`.`valor` AS `valor`,(`bdclick`.`bdclickppal`.`valor` * `bdclick`.`bdclickppal`.`cantidadRealizada`) AS `valorTotal`,`bdclick`.`bdclickppal`.`facturaNumero` AS `orden`,`bdclick`.`bdclickppal`.`estado2` AS `estado2` from `bdclick`.`bdclickppal`
mariadb-version=100135