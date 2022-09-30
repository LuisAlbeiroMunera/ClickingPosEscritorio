TYPE=VIEW
query=select `bdclick4`.`bdterceros`.`id` AS `Id`,`bdclick4`.`bdterceros`.`nombre` AS `nombre`,`bdclick4`.`bdplacas`.`placa` AS `placa` from (`bdclick4`.`bdterceros` join `bdclick4`.`bdplacas` on((`bdclick4`.`bdterceros`.`idSistema` = `bdclick4`.`bdplacas`.`usuario`)))
md5=73291693b983166adc43406f5e075d60
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:29
create-version=2
source=select `bdterceros`.`id` AS `Id`,`bdterceros`.`nombre` AS `nombre`,`bdplacas`.`placa` AS `placa` from (`bdterceros` join `bdplacas` on((`bdterceros`.`idSistema` = `bdplacas`.`usuario`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdterceros`.`id` AS `Id`,`bdclick4`.`bdterceros`.`nombre` AS `nombre`,`bdclick4`.`bdplacas`.`placa` AS `placa` from (`bdclick4`.`bdterceros` join `bdclick4`.`bdplacas` on((`bdclick4`.`bdterceros`.`idSistema` = `bdclick4`.`bdplacas`.`usuario`)))
mariadb-version=100135
