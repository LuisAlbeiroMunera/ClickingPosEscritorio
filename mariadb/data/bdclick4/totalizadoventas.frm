TYPE=VIEW
query=select `bdclick4`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick4`.`bdfactura`.`cantidad`),\'0\',`bdclick4`.`bdfactura`.`cantidad`)) AS `Expr1` from (`bdclick4`.`bdproductos` left join `bdclick4`.`bdfactura` on((`bdclick4`.`bdfactura`.`producto` = `bdclick4`.`bdproductos`.`idSistema`))) where ((`bdclick4`.`bdfactura`.`bodega` = \'123-22\') or (`bdclick4`.`bdfactura`.`bodega` = \'\')) group by `bdclick4`.`bdproductos`.`idSistema`
md5=c6e5cb1a150af886b9f31e9705f5746a
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:33
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdfactura`.`cantidad`),\'0\',`bdfactura`.`cantidad`)) AS `Expr1` from (`bdproductos` left join `bdfactura` on((`bdfactura`.`producto` = `bdproductos`.`idSistema`))) where ((`bdfactura`.`bodega` = \'123-22\') or (`bdfactura`.`bodega` = \'\')) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick4`.`bdfactura`.`cantidad`),\'0\',`bdclick4`.`bdfactura`.`cantidad`)) AS `Expr1` from (`bdclick4`.`bdproductos` left join `bdclick4`.`bdfactura` on((`bdclick4`.`bdfactura`.`producto` = `bdclick4`.`bdproductos`.`idSistema`))) where ((`bdclick4`.`bdfactura`.`bodega` = \'123-22\') or (`bdclick4`.`bdfactura`.`bodega` = \'\')) group by `bdclick4`.`bdproductos`.`idSistema`
mariadb-version=100135
