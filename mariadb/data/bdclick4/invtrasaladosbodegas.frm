TYPE=VIEW
query=(select `bdclick4`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`bdclick4`.`invtrasladosbodegasprincipal`.`cantidad`),\'0\',`bdclick4`.`invtrasladosbodegasprincipal`.`cantidad`)) AS `salidas` from (`bdclick4`.`bdproductos` left join `bdclick4`.`invtrasladosbodegasprincipal` on((`bdclick4`.`invtrasladosbodegasprincipal`.`producto` = `bdclick4`.`bdproductos`.`Codigo`))) group by `bdclick4`.`bdproductos`.`Codigo`)
md5=b3be899f84466856611c8fc804c104fa
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:28
create-version=2
source=(select `bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`invtrasladosbodegasprincipal`.`cantidad`),\'0\',`invtrasladosbodegasprincipal`.`cantidad`)) AS `salidas` from (`bdproductos` left join `invtrasladosbodegasprincipal` on((`invtrasladosbodegasprincipal`.`producto` = `bdproductos`.`Codigo`))) group by `bdproductos`.`Codigo`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick4`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`bdclick4`.`invtrasladosbodegasprincipal`.`cantidad`),\'0\',`bdclick4`.`invtrasladosbodegasprincipal`.`cantidad`)) AS `salidas` from (`bdclick4`.`bdproductos` left join `bdclick4`.`invtrasladosbodegasprincipal` on((`bdclick4`.`invtrasladosbodegasprincipal`.`producto` = `bdclick4`.`bdproductos`.`Codigo`))) group by `bdclick4`.`bdproductos`.`Codigo`)
mariadb-version=100135
