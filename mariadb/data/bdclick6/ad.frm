TYPE=VIEW
query=select `bdclick6`.`bdclickppal`.`codPrestadorServicio` AS `codPrestadorServicio`,`bdclick6`.`bdclickppal`.`codigoConcepto` AS `codigoConcepto`,`bdclick6`.`bdclickppal`.`cantidadRealizada` AS `cantidadRealizada`,`bdclick6`.`bdclickppal`.`valor` AS `valor`,(`bdclick6`.`bdclickppal`.`valor` * `bdclick6`.`bdclickppal`.`cantidadRealizada`) AS `valorTotal`,`bdclick6`.`bdclickppal`.`facturaNumero` AS `orden`,`bdclick6`.`bdclickppal`.`estado2` AS `estado2` from `bdclick6`.`bdclickppal`
md5=77de8fd3feb7c9f64f2dd809f506b558
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:32
create-version=2
source=select `bdclickppal`.`codPrestadorServicio` AS `codPrestadorServicio`,`bdclickppal`.`codigoConcepto` AS `codigoConcepto`,`bdclickppal`.`cantidadRealizada` AS `cantidadRealizada`,`bdclickppal`.`valor` AS `valor`,(`bdclickppal`.`valor` * `bdclickppal`.`cantidadRealizada`) AS `valorTotal`,`bdclickppal`.`facturaNumero` AS `orden`,`bdclickppal`.`estado2` AS `estado2` from `bdclickppal`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdclickppal`.`codPrestadorServicio` AS `codPrestadorServicio`,`bdclick6`.`bdclickppal`.`codigoConcepto` AS `codigoConcepto`,`bdclick6`.`bdclickppal`.`cantidadRealizada` AS `cantidadRealizada`,`bdclick6`.`bdclickppal`.`valor` AS `valor`,(`bdclick6`.`bdclickppal`.`valor` * `bdclick6`.`bdclickppal`.`cantidadRealizada`) AS `valorTotal`,`bdclick6`.`bdclickppal`.`facturaNumero` AS `orden`,`bdclick6`.`bdclickppal`.`estado2` AS `estado2` from `bdclick6`.`bdclickppal`
mariadb-version=100135
