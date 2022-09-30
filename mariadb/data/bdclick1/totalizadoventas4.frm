TYPE=VIEW
query=select `bdclick1`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick1`.`bdfactura`.`cantidad`),\'0\',`bdclick1`.`bdfactura`.`cantidad`)) AS `Expr1` from (`bdclick1`.`bdproductosbodega4` left join `bdclick1`.`bdfactura` on((`bdclick1`.`bdfactura`.`producto` = `bdclick1`.`bdproductosbodega4`.`idSistema`))) where (`bdclick1`.`bdfactura`.`bodega` = \'BODEGA-4\') group by `bdclick1`.`bdproductosbodega4`.`idSistema`
md5=dafa81fe0241b71f5f3e6bfff4dc795a
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:40
create-version=2
source=select `bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`bdfactura`.`cantidad`),\'0\',`bdfactura`.`cantidad`)) AS `Expr1` from (`bdproductosbodega4` left join `bdfactura` on((`bdfactura`.`producto` = `bdproductosbodega4`.`idSistema`))) where (`bdfactura`.`bodega` = \'BODEGA-4\') group by `bdproductosbodega4`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick1`.`bdfactura`.`cantidad`),\'0\',`bdclick1`.`bdfactura`.`cantidad`)) AS `Expr1` from (`bdclick1`.`bdproductosbodega4` left join `bdclick1`.`bdfactura` on((`bdclick1`.`bdfactura`.`producto` = `bdclick1`.`bdproductosbodega4`.`idSistema`))) where (`bdclick1`.`bdfactura`.`bodega` = \'BODEGA-4\') group by `bdclick1`.`bdproductosbodega4`.`idSistema`
mariadb-version=100135
