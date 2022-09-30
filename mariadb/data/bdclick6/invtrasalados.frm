TYPE=VIEW
query=(select `bdclick6`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`bdclick6`.`invtrasladosprincipal`.`cantidad`),\'0\',`bdclick6`.`invtrasladosprincipal`.`cantidad`)) AS `salidas` from (`bdclick6`.`bdproductos` left join `bdclick6`.`invtrasladosprincipal` on((`bdclick6`.`invtrasladosprincipal`.`producto` = `bdclick6`.`bdproductos`.`Codigo`))) group by `bdclick6`.`bdproductos`.`Codigo`)
md5=c6f8aef1f91715ba49a17a92a281017b
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:36
create-version=2
source=(select `bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`invtrasladosprincipal`.`cantidad`),\'0\',`invtrasladosprincipal`.`cantidad`)) AS `salidas` from (`bdproductos` left join `invtrasladosprincipal` on((`invtrasladosprincipal`.`producto` = `bdproductos`.`Codigo`))) group by `bdproductos`.`Codigo`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick6`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`bdclick6`.`invtrasladosprincipal`.`cantidad`),\'0\',`bdclick6`.`invtrasladosprincipal`.`cantidad`)) AS `salidas` from (`bdclick6`.`bdproductos` left join `bdclick6`.`invtrasladosprincipal` on((`bdclick6`.`invtrasladosprincipal`.`producto` = `bdclick6`.`bdproductos`.`Codigo`))) group by `bdclick6`.`bdproductos`.`Codigo`)
mariadb-version=100135
