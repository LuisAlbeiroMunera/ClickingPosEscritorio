TYPE=VIEW
query=(select `bdclick`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`bdclick`.`invtrasladosbodegasprincipal`.`cantidad`),\'0\',`bdclick`.`invtrasladosbodegasprincipal`.`cantidad`)) AS `salidas` from (`bdclick`.`bdproductos` left join `bdclick`.`invtrasladosbodegasprincipal` on((`bdclick`.`invtrasladosbodegasprincipal`.`producto` = `bdclick`.`bdproductos`.`Codigo`))) group by `bdclick`.`bdproductos`.`Codigo`)
md5=0bc2358fbaec7e7710a6290ad0990a24
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:24
create-version=2
source=(select `bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`invtrasladosbodegasprincipal`.`cantidad`),\'0\',`invtrasladosbodegasprincipal`.`cantidad`)) AS `salidas` from (`bdproductos` left join `invtrasladosbodegasprincipal` on((`invtrasladosbodegasprincipal`.`producto` = `bdproductos`.`Codigo`))) group by `bdproductos`.`Codigo`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`bdclick`.`invtrasladosbodegasprincipal`.`cantidad`),\'0\',`bdclick`.`invtrasladosbodegasprincipal`.`cantidad`)) AS `salidas` from (`bdclick`.`bdproductos` left join `bdclick`.`invtrasladosbodegasprincipal` on((`bdclick`.`invtrasladosbodegasprincipal`.`producto` = `bdclick`.`bdproductos`.`Codigo`))) group by `bdclick`.`bdproductos`.`Codigo`)
mariadb-version=100135
