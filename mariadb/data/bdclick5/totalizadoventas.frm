TYPE=VIEW
query=select `bdclick5`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick5`.`bdfactura`.`cantidad`),\'0\',`bdclick5`.`bdfactura`.`cantidad`)) AS `Expr1` from (`bdclick5`.`bdproductos` left join `bdclick5`.`bdfactura` on((`bdclick5`.`bdfactura`.`producto` = `bdclick5`.`bdproductos`.`idSistema`))) where ((`bdclick5`.`bdfactura`.`bodega` = \'123-22\') or (`bdclick5`.`bdfactura`.`bodega` = \'\')) group by `bdclick5`.`bdproductos`.`idSistema`
md5=42702862d12612a43d6666b1b3bd2fa8
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:53
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdfactura`.`cantidad`),\'0\',`bdfactura`.`cantidad`)) AS `Expr1` from (`bdproductos` left join `bdfactura` on((`bdfactura`.`producto` = `bdproductos`.`idSistema`))) where ((`bdfactura`.`bodega` = \'123-22\') or (`bdfactura`.`bodega` = \'\')) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick5`.`bdfactura`.`cantidad`),\'0\',`bdclick5`.`bdfactura`.`cantidad`)) AS `Expr1` from (`bdclick5`.`bdproductos` left join `bdclick5`.`bdfactura` on((`bdclick5`.`bdfactura`.`producto` = `bdclick5`.`bdproductos`.`idSistema`))) where ((`bdclick5`.`bdfactura`.`bodega` = \'123-22\') or (`bdclick5`.`bdfactura`.`bodega` = \'\')) group by `bdclick5`.`bdproductos`.`idSistema`
mariadb-version=100135
