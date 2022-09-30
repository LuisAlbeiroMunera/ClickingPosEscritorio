TYPE=VIEW
query=select `bdclick2`.`bdterceros`.`id` AS `Id`,`bdclick2`.`bdterceros`.`nombre` AS `nombre`,`bdclick2`.`bdplacas`.`placa` AS `placa` from (`bdclick2`.`bdterceros` join `bdclick2`.`bdplacas` on((`bdclick2`.`bdterceros`.`idSistema` = `bdclick2`.`bdplacas`.`usuario`)))
md5=131ad9cd6e03d38066397ed5c8af4e0f
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:46
create-version=2
source=select `bdterceros`.`id` AS `Id`,`bdterceros`.`nombre` AS `nombre`,`bdplacas`.`placa` AS `placa` from (`bdterceros` join `bdplacas` on((`bdterceros`.`idSistema` = `bdplacas`.`usuario`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdterceros`.`id` AS `Id`,`bdclick2`.`bdterceros`.`nombre` AS `nombre`,`bdclick2`.`bdplacas`.`placa` AS `placa` from (`bdclick2`.`bdterceros` join `bdclick2`.`bdplacas` on((`bdclick2`.`bdterceros`.`idSistema` = `bdclick2`.`bdplacas`.`usuario`)))
mariadb-version=100135
