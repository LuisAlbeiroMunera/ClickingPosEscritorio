TYPE=VIEW
query=(select `bdclick6`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`bdclick6`.`invtrasladosbodegasprincipal`.`cantidad`),\'0\',`bdclick6`.`invtrasladosbodegasprincipal`.`cantidad`)) AS `salidas` from (`bdclick6`.`bdproductos` left join `bdclick6`.`invtrasladosbodegasprincipal` on((`bdclick6`.`invtrasladosbodegasprincipal`.`producto` = `bdclick6`.`bdproductos`.`Codigo`))) group by `bdclick6`.`bdproductos`.`Codigo`)
md5=28da42b89f1ee5c3786c3852abe596e6
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:36
create-version=2
source=(select `bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`invtrasladosbodegasprincipal`.`cantidad`),\'0\',`invtrasladosbodegasprincipal`.`cantidad`)) AS `salidas` from (`bdproductos` left join `invtrasladosbodegasprincipal` on((`invtrasladosbodegasprincipal`.`producto` = `bdproductos`.`Codigo`))) group by `bdproductos`.`Codigo`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick6`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`bdclick6`.`invtrasladosbodegasprincipal`.`cantidad`),\'0\',`bdclick6`.`invtrasladosbodegasprincipal`.`cantidad`)) AS `salidas` from (`bdclick6`.`bdproductos` left join `bdclick6`.`invtrasladosbodegasprincipal` on((`bdclick6`.`invtrasladosbodegasprincipal`.`producto` = `bdclick6`.`bdproductos`.`Codigo`))) group by `bdclick6`.`bdproductos`.`Codigo`)
mariadb-version=100135
