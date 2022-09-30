TYPE=VIEW
query=select `bdclick3`.`bdterceros`.`id` AS `Id`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,`bdclick3`.`bdplacas`.`placa` AS `placa` from (`bdclick3`.`bdterceros` join `bdclick3`.`bdplacas` on((`bdclick3`.`bdterceros`.`idSistema` = `bdclick3`.`bdplacas`.`usuario`)))
md5=b21408ef4f22639c5696042ff36f11d3
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:52
create-version=2
source=select `bdterceros`.`id` AS `Id`,`bdterceros`.`nombre` AS `nombre`,`bdplacas`.`placa` AS `placa` from (`bdterceros` join `bdplacas` on((`bdterceros`.`idSistema` = `bdplacas`.`usuario`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdterceros`.`id` AS `Id`,`bdclick3`.`bdterceros`.`nombre` AS `nombre`,`bdclick3`.`bdplacas`.`placa` AS `placa` from (`bdclick3`.`bdterceros` join `bdclick3`.`bdplacas` on((`bdclick3`.`bdterceros`.`idSistema` = `bdclick3`.`bdplacas`.`usuario`)))
mariadb-version=100135
