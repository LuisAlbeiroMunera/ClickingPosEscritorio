TYPE=VIEW
query=select `bdclick`.`bdterceros`.`id` AS `Id`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,`bdclick`.`bdplacas`.`placa` AS `placa` from (`bdclick`.`bdterceros` join `bdclick`.`bdplacas` on((`bdclick`.`bdterceros`.`idSistema` = `bdclick`.`bdplacas`.`usuario`)))
md5=6a9c7972c0586b215ecdb59091a31c23
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:25
create-version=2
source=select `bdterceros`.`id` AS `Id`,`bdterceros`.`nombre` AS `nombre`,`bdplacas`.`placa` AS `placa` from (`bdterceros` join `bdplacas` on((`bdterceros`.`idSistema` = `bdplacas`.`usuario`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdterceros`.`id` AS `Id`,`bdclick`.`bdterceros`.`nombre` AS `nombre`,`bdclick`.`bdplacas`.`placa` AS `placa` from (`bdclick`.`bdterceros` join `bdclick`.`bdplacas` on((`bdclick`.`bdterceros`.`idSistema` = `bdclick`.`bdplacas`.`usuario`)))
mariadb-version=100135
