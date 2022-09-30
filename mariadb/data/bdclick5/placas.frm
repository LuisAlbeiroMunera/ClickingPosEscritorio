TYPE=VIEW
query=select `bdclick5`.`bdterceros`.`id` AS `Id`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdplacas`.`placa` AS `placa` from (`bdclick5`.`bdterceros` join `bdclick5`.`bdplacas` on((`bdclick5`.`bdterceros`.`idSistema` = `bdclick5`.`bdplacas`.`usuario`)))
md5=5c35f2a936ad89e5dea55b9adabe58ac
updatable=1
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:48
create-version=2
source=select `bdterceros`.`id` AS `Id`,`bdterceros`.`nombre` AS `nombre`,`bdplacas`.`placa` AS `placa` from (`bdterceros` join `bdplacas` on((`bdterceros`.`idSistema` = `bdplacas`.`usuario`)))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdterceros`.`id` AS `Id`,`bdclick5`.`bdterceros`.`nombre` AS `nombre`,`bdclick5`.`bdplacas`.`placa` AS `placa` from (`bdclick5`.`bdterceros` join `bdclick5`.`bdplacas` on((`bdclick5`.`bdterceros`.`idSistema` = `bdclick5`.`bdplacas`.`usuario`)))
mariadb-version=100135
