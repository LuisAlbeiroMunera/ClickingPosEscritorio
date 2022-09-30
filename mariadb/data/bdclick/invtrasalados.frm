TYPE=VIEW
query=(select `bdclick`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`bdclick`.`invtrasladosprincipal`.`cantidad`),\'0\',`bdclick`.`invtrasladosprincipal`.`cantidad`)) AS `salidas` from (`bdclick`.`bdproductos` left join `bdclick`.`invtrasladosprincipal` on((`bdclick`.`invtrasladosprincipal`.`producto` = `bdclick`.`bdproductos`.`Codigo`))) group by `bdclick`.`bdproductos`.`Codigo`)
md5=e50535ff0d7281ee23b2e1181366a103
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:24
create-version=2
source=(select `bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`invtrasladosprincipal`.`cantidad`),\'0\',`invtrasladosprincipal`.`cantidad`)) AS `salidas` from (`bdproductos` left join `invtrasladosprincipal` on((`invtrasladosprincipal`.`producto` = `bdproductos`.`Codigo`))) group by `bdproductos`.`Codigo`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`bdclick`.`invtrasladosprincipal`.`cantidad`),\'0\',`bdclick`.`invtrasladosprincipal`.`cantidad`)) AS `salidas` from (`bdclick`.`bdproductos` left join `bdclick`.`invtrasladosprincipal` on((`bdclick`.`invtrasladosprincipal`.`producto` = `bdclick`.`bdproductos`.`Codigo`))) group by `bdclick`.`bdproductos`.`Codigo`)
mariadb-version=100135
