TYPE=VIEW
query=select `bdclick1`.`bdterceros`.`id` AS `Id`,`bdclick1`.`bdterceros`.`nombre` AS `nombre`,`bdclick1`.`bdplacas`.`placa` AS `placa` from (`bdclick1`.`bdterceros` join `bdclick1`.`bdplacas` on((`bdclick1`.`bdterceros`.`idSistema` = `bdclick1`.`bdplacas`.`usuario`)))
md5=bb79206934756e4302b463d559de2966
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:36
create-version=2
source=select `bdterceros`.`id` AS `Id`,`bdterceros`.`nombre` AS `nombre`,`bdplacas`.`placa` AS `placa` from (`bdterceros` join `bdplacas` on((`bdterceros`.`idSistema` = `bdplacas`.`usuario`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdterceros`.`id` AS `Id`,`bdclick1`.`bdterceros`.`nombre` AS `nombre`,`bdclick1`.`bdplacas`.`placa` AS `placa` from (`bdclick1`.`bdterceros` join `bdclick1`.`bdplacas` on((`bdclick1`.`bdterceros`.`idSistema` = `bdclick1`.`bdplacas`.`usuario`)))
mariadb-version=100135
