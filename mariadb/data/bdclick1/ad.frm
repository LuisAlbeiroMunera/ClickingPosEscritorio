TYPE=VIEW
query=select `bdclick1`.`bdclickppal`.`codPrestadorServicio` AS `codPrestadorServicio`,`bdclick1`.`bdclickppal`.`codigoConcepto` AS `codigoConcepto`,`bdclick1`.`bdclickppal`.`cantidadRealizada` AS `cantidadRealizada`,`bdclick1`.`bdclickppal`.`valor` AS `valor`,(`bdclick1`.`bdclickppal`.`valor` * `bdclick1`.`bdclickppal`.`cantidadRealizada`) AS `valorTotal`,`bdclick1`.`bdclickppal`.`facturaNumero` AS `orden`,`bdclick1`.`bdclickppal`.`estado2` AS `estado2` from `bdclick1`.`bdclickppal`
md5=8aff49204b344504ac68356c04721931
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:31
create-version=2
source=select `bdclickppal`.`codPrestadorServicio` AS `codPrestadorServicio`,`bdclickppal`.`codigoConcepto` AS `codigoConcepto`,`bdclickppal`.`cantidadRealizada` AS `cantidadRealizada`,`bdclickppal`.`valor` AS `valor`,(`bdclickppal`.`valor` * `bdclickppal`.`cantidadRealizada`) AS `valorTotal`,`bdclickppal`.`facturaNumero` AS `orden`,`bdclickppal`.`estado2` AS `estado2` from `bdclickppal`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdclickppal`.`codPrestadorServicio` AS `codPrestadorServicio`,`bdclick1`.`bdclickppal`.`codigoConcepto` AS `codigoConcepto`,`bdclick1`.`bdclickppal`.`cantidadRealizada` AS `cantidadRealizada`,`bdclick1`.`bdclickppal`.`valor` AS `valor`,(`bdclick1`.`bdclickppal`.`valor` * `bdclick1`.`bdclickppal`.`cantidadRealizada`) AS `valorTotal`,`bdclick1`.`bdclickppal`.`facturaNumero` AS `orden`,`bdclick1`.`bdclickppal`.`estado2` AS `estado2` from `bdclick1`.`bdclickppal`
mariadb-version=100135