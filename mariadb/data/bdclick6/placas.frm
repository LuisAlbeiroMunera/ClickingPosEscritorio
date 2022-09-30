TYPE=VIEW
query=select `bdclick6`.`bdterceros`.`id` AS `Id`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdplacas`.`placa` AS `placa` from (`bdclick6`.`bdterceros` join `bdclick6`.`bdplacas` on((`bdclick6`.`bdterceros`.`idSistema` = `bdclick6`.`bdplacas`.`usuario`)))
md5=55503d5464b7ed76a078b3c2dd19cf28
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:36
create-version=2
source=select `bdterceros`.`id` AS `Id`,`bdterceros`.`nombre` AS `nombre`,`bdplacas`.`placa` AS `placa` from (`bdterceros` join `bdplacas` on((`bdterceros`.`idSistema` = `bdplacas`.`usuario`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdterceros`.`id` AS `Id`,`bdclick6`.`bdterceros`.`nombre` AS `nombre`,`bdclick6`.`bdplacas`.`placa` AS `placa` from (`bdclick6`.`bdterceros` join `bdclick6`.`bdplacas` on((`bdclick6`.`bdterceros`.`idSistema` = `bdclick6`.`bdplacas`.`usuario`)))
mariadb-version=100135
