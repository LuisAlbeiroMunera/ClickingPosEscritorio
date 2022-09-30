TYPE=VIEW
query=select `bdclick5`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick5`.`bdfactura`.`cantidad`),\'0\',`bdclick5`.`bdfactura`.`cantidad`)) AS `Expr1` from (`bdclick5`.`bdproductosbodega3` left join `bdclick5`.`bdfactura` on((`bdclick5`.`bdfactura`.`producto` = `bdclick5`.`bdproductosbodega3`.`idSistema`))) where (`bdclick5`.`bdfactura`.`bodega` = \'BODEGA-3\') group by `bdclick5`.`bdproductosbodega3`.`idSistema`
md5=82ea99618c14c2c2817b493a46cf03b9
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:53
create-version=2
source=select `bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`bdfactura`.`cantidad`),\'0\',`bdfactura`.`cantidad`)) AS `Expr1` from (`bdproductosbodega3` left join `bdfactura` on((`bdfactura`.`producto` = `bdproductosbodega3`.`idSistema`))) where (`bdfactura`.`bodega` = \'BODEGA-3\') group by `bdproductosbodega3`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick5`.`bdfactura`.`cantidad`),\'0\',`bdclick5`.`bdfactura`.`cantidad`)) AS `Expr1` from (`bdclick5`.`bdproductosbodega3` left join `bdclick5`.`bdfactura` on((`bdclick5`.`bdfactura`.`producto` = `bdclick5`.`bdproductosbodega3`.`idSistema`))) where (`bdclick5`.`bdfactura`.`bodega` = \'BODEGA-3\') group by `bdclick5`.`bdproductosbodega3`.`idSistema`
mariadb-version=100135
