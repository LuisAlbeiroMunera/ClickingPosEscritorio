TYPE=VIEW
query=(select `bdclick4`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`bdclick4`.`invtrasladosprincipal`.`cantidad`),\'0\',`bdclick4`.`invtrasladosprincipal`.`cantidad`)) AS `salidas` from (`bdclick4`.`bdproductos` left join `bdclick4`.`invtrasladosprincipal` on((`bdclick4`.`invtrasladosprincipal`.`producto` = `bdclick4`.`bdproductos`.`Codigo`))) group by `bdclick4`.`bdproductos`.`Codigo`)
md5=4e43d8d75f3d7f09e1322b724071ca7d
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:28
create-version=2
source=(select `bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`invtrasladosprincipal`.`cantidad`),\'0\',`invtrasladosprincipal`.`cantidad`)) AS `salidas` from (`bdproductos` left join `invtrasladosprincipal` on((`invtrasladosprincipal`.`producto` = `bdproductos`.`Codigo`))) group by `bdproductos`.`Codigo`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick4`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`bdclick4`.`invtrasladosprincipal`.`cantidad`),\'0\',`bdclick4`.`invtrasladosprincipal`.`cantidad`)) AS `salidas` from (`bdclick4`.`bdproductos` left join `bdclick4`.`invtrasladosprincipal` on((`bdclick4`.`invtrasladosprincipal`.`producto` = `bdclick4`.`bdproductos`.`Codigo`))) group by `bdclick4`.`bdproductos`.`Codigo`)
mariadb-version=100135
