TYPE=VIEW
query=(select `bdclick1`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`bdclick1`.`invtrasladosbodegasprincipal`.`cantidad`),\'0\',`bdclick1`.`invtrasladosbodegasprincipal`.`cantidad`)) AS `salidas` from (`bdclick1`.`bdproductos` left join `bdclick1`.`invtrasladosbodegasprincipal` on((`bdclick1`.`invtrasladosbodegasprincipal`.`producto` = `bdclick1`.`bdproductos`.`Codigo`))) group by `bdclick1`.`bdproductos`.`Codigo`)
md5=c46580b942664a5edfb2462522d1d091
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:35
create-version=2
source=(select `bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`invtrasladosbodegasprincipal`.`cantidad`),\'0\',`invtrasladosbodegasprincipal`.`cantidad`)) AS `salidas` from (`bdproductos` left join `invtrasladosbodegasprincipal` on((`invtrasladosbodegasprincipal`.`producto` = `bdproductos`.`Codigo`))) group by `bdproductos`.`Codigo`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick1`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`bdclick1`.`invtrasladosbodegasprincipal`.`cantidad`),\'0\',`bdclick1`.`invtrasladosbodegasprincipal`.`cantidad`)) AS `salidas` from (`bdclick1`.`bdproductos` left join `bdclick1`.`invtrasladosbodegasprincipal` on((`bdclick1`.`invtrasladosbodegasprincipal`.`producto` = `bdclick1`.`bdproductos`.`Codigo`))) group by `bdclick1`.`bdproductos`.`Codigo`)
mariadb-version=100135
