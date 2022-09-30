TYPE=VIEW
query=select `bdclick1`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`pedidos1`.`cantidad`),\'0\',`pedidos1`.`cantidad`)) AS `Expr1` from (`bdclick1`.`bdproductosbodega4` left join `bdclick1`.`pedidos1` on((`bdclick1`.`bdproductosbodega4`.`idSistema` = `pedidos1`.`producto`))) where (`pedidos1`.`bodega` = \'BODEGA-4\') group by `bdclick1`.`bdproductosbodega4`.`idSistema`
md5=24c627e1b4659d1080d85851b33343fc
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:40
create-version=2
source=select `bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`pedidos1`.`cantidad`),\'0\',`pedidos1`.`cantidad`)) AS `Expr1` from (`bdproductosbodega4` left join `pedidos1` on((`bdproductosbodega4`.`idSistema` = `pedidos1`.`producto`))) where (`pedidos1`.`bodega` = \'BODEGA-4\') group by `bdproductosbodega4`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`pedidos1`.`cantidad`),\'0\',`pedidos1`.`cantidad`)) AS `Expr1` from (`bdclick1`.`bdproductosbodega4` left join `bdclick1`.`pedidos1` on((`bdclick1`.`bdproductosbodega4`.`idSistema` = `pedidos1`.`producto`))) where (`pedidos1`.`bodega` = \'BODEGA-4\') group by `bdclick1`.`bdproductosbodega4`.`idSistema`
mariadb-version=100135
