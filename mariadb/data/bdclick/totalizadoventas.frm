TYPE=VIEW
query=select `bdclick`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick`.`bdfactura`.`cantidad`),\'0\',`bdclick`.`bdfactura`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductos` left join `bdclick`.`bdfactura` on((`bdclick`.`bdfactura`.`producto` = `bdclick`.`bdproductos`.`idSistema`))) where ((`bdclick`.`bdfactura`.`bodega` = \'123-22\') or (`bdclick`.`bdfactura`.`bodega` = \'\')) group by `bdclick`.`bdproductos`.`idSistema`
md5=7398bc3ce535916932bbca8da4c610c6
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:30
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdfactura`.`cantidad`),\'0\',`bdfactura`.`cantidad`)) AS `Expr1` from (`bdproductos` left join `bdfactura` on((`bdfactura`.`producto` = `bdproductos`.`idSistema`))) where ((`bdfactura`.`bodega` = \'123-22\') or (`bdfactura`.`bodega` = \'\')) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick`.`bdfactura`.`cantidad`),\'0\',`bdclick`.`bdfactura`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductos` left join `bdclick`.`bdfactura` on((`bdclick`.`bdfactura`.`producto` = `bdclick`.`bdproductos`.`idSistema`))) where ((`bdclick`.`bdfactura`.`bodega` = \'123-22\') or (`bdclick`.`bdfactura`.`bodega` = \'\')) group by `bdclick`.`bdproductos`.`idSistema`
mariadb-version=100135
