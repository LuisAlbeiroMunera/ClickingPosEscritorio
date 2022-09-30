TYPE=VIEW
query=(select `bdclick2`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`bdclick2`.`invtrasladosbodegasprincipal`.`cantidad`),\'0\',`bdclick2`.`invtrasladosbodegasprincipal`.`cantidad`)) AS `salidas` from (`bdclick2`.`bdproductos` left join `bdclick2`.`invtrasladosbodegasprincipal` on((`bdclick2`.`invtrasladosbodegasprincipal`.`producto` = `bdclick2`.`bdproductos`.`Codigo`))) group by `bdclick2`.`bdproductos`.`Codigo`)
md5=0a91d96167d07b3ff1babcea0d804aa6
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:45
create-version=2
source=(select `bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`invtrasladosbodegasprincipal`.`cantidad`),\'0\',`invtrasladosbodegasprincipal`.`cantidad`)) AS `salidas` from (`bdproductos` left join `invtrasladosbodegasprincipal` on((`invtrasladosbodegasprincipal`.`producto` = `bdproductos`.`Codigo`))) group by `bdproductos`.`Codigo`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick2`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`bdclick2`.`invtrasladosbodegasprincipal`.`cantidad`),\'0\',`bdclick2`.`invtrasladosbodegasprincipal`.`cantidad`)) AS `salidas` from (`bdclick2`.`bdproductos` left join `bdclick2`.`invtrasladosbodegasprincipal` on((`bdclick2`.`invtrasladosbodegasprincipal`.`producto` = `bdclick2`.`bdproductos`.`Codigo`))) group by `bdclick2`.`bdproductos`.`Codigo`)
mariadb-version=100135
